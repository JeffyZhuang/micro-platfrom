package com.zzh.repository.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_system_resources")
public class ResourcePO {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 资源code
     */
    @Column(name = "resource_code")
    private String resourceCode;

    /**
     * 资源名
     */
    @Column(name = "resource_name")
    private String resourceName;

    /**
     * 简介
     */
    private String intro;

    /**
     * 图标
     */
    private String icon;

    /**
     * 上级菜单code
     */
    @Column(name = "parent_code")
    private String parentCode;

    /**
     * 排序
     */
    @Column(name = "order_seq")
    private Integer orderSeq;

    /**
     * 有效、失效
     */
    private String disabled;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 更新人
     */
    @Column(name = "updated_by")
    private String updatedBy;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取资源code
     *
     * @return resource_code - 资源code
     */
    public String getResourceCode() {
        return resourceCode;
    }

    /**
     * 设置资源code
     *
     * @param resourceCode 资源code
     */
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    /**
     * 获取资源名
     *
     * @return resource_name - 资源名
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置资源名
     *
     * @param resourceName 资源名
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * 获取简介
     *
     * @return intro - 简介
     */
    public String getIntro() {
        return intro;
    }

    /**
     * 设置简介
     *
     * @param intro 简介
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取上级菜单code
     *
     * @return parent_code - 上级菜单code
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 设置上级菜单code
     *
     * @param parentCode 上级菜单code
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * 获取排序
     *
     * @return order_seq - 排序
     */
    public Integer getOrderSeq() {
        return orderSeq;
    }

    /**
     * 设置排序
     *
     * @param orderSeq 排序
     */
    public void setOrderSeq(Integer orderSeq) {
        this.orderSeq = orderSeq;
    }

    /**
     * 获取有效、失效
     *
     * @return disabled - 有效、失效
     */
    public String getDisabled() {
        return disabled;
    }

    /**
     * 设置有效、失效
     *
     * @param disabled 有效、失效
     */
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取更新人
     *
     * @return updated_by - 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}