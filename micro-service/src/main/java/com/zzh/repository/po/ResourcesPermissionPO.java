package com.zzh.repository.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_system_resources_permission")
public class ResourcesPermissionPO {
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
     * 权限code
     */
    @Column(name = "permissiom_code")
    private String permissiomCode;

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
     * 获取权限code
     *
     * @return permissiom_code - 权限code
     */
    public String getPermissiomCode() {
        return permissiomCode;
    }

    /**
     * 设置权限code
     *
     * @param permissiomCode 权限code
     */
    public void setPermissiomCode(String permissiomCode) {
        this.permissiomCode = permissiomCode;
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