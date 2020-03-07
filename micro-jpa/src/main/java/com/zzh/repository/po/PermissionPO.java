package com.zzh.repository.po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_system_permission")
public class PermissionPO {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 权限code
     */
    @Column(name = "permission_code")
    private String permissionCode;

    /**
     * 权限路径
     */
    private String path;

    /**
     * 简介
     */
    private String intro;

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
     * 获取权限code
     *
     * @return permission_code - 权限code
     */
    public String getPermissionCode() {
        return permissionCode;
    }

    /**
     * 设置权限code
     *
     * @param permissionCode 权限code
     */
    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    /**
     * 获取权限路径
     *
     * @return path - 权限路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置权限路径
     *
     * @param path 权限路径
     */
    public void setPath(String path) {
        this.path = path;
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