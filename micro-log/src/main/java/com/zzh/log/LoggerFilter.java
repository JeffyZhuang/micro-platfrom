package com.zzh.log;

import com.zzh.utils.CollectionUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author: zzh
 * @Description:Log 过滤器
 * @Date: 2019/8/27
 */
@Slf4j
public class LoggerFilter implements Filter {
    private LogProperties logProperties;

    public LoggerFilter(LogProperties logProperties) {
        this.logProperties = logProperties;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws
            IOException, ServletException {
        if (request instanceof HttpServletRequest && response instanceof HttpServletResponse) {
            try {
                String traceId = traceId(request);
                MDC.put("traceId", traceId);
                HttpServletRequest httpServletRequest = (HttpServletRequest) request;
                httpServletRequest.setCharacterEncoding("UTF-8");
                String uri = httpServletRequest.getRequestURI();
                if (isIgnoreUri(uri)) {
                    filterChain.doFilter(request, response);
                    return;
                }
                filterChain.doFilter(request, response);
                //包装wrapper
            } catch (Throwable e) {
                log.error("request error={}", e);
                throw e;
            } finally {
                MDC.clear();
            }
        }
    }

    private boolean isIgnoreUri(String uri) {
        return isDefaultUri(uri) || (CollectionUtil.isNotEmpty(logProperties.getIgnoreUris()) && logProperties
                .getIgnoreUris().stream().anyMatch(uri::contains));
    }

    private boolean isDefaultUri(String uri) {
        return CollectionUtil.isNotEmpty(logProperties.getDefaultIgnoreUris()) && logProperties.getDefaultIgnoreUris
                ().stream().anyMatch(uri::contains);
    }

    private String traceId(ServletRequest request) {
        String headerTraceId = ((HttpServletRequest) request).getHeader(logProperties.getHeaderTraceIdKey());
        return CollectionUtil.isEmpty(headerTraceId) ? UUID.randomUUID().toString() : headerTraceId;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
