package com.zzh;

/**
 * @Description API 服务
 * @Author zzh
 * @Date 2019/8/3 15:48
 **/
public class ApiInfo {
    public static class System {
        public static final String USER_SERVICE = "用户服务";
        public static final String HELP_SERVICE = "辅助服务";

        public static class User {
            public static final String GET_USER = "获取用户信息";
        }

        public static class Help {
            public static final String GET_PROPERTIES = "获取配置文件";
        }
    }
}
