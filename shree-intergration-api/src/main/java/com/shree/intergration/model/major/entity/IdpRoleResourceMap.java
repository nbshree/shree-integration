package com.shree.intergration.model.major.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 角色资源关系表
 * </p>
 *
 * @author shree
 * @since 2020-07-01
 */
public class IdpRoleResourceMap extends Model<IdpRoleResourceMap> {

    /**
    * 所有字段名
    */
    public static class Columns {
        /**
        * id@(SnowflakeId)
        */
        public static final String id = "id";
        /**
        * 记录状态@(0:删除,1:正常)
        */
        public static final String status = "status";
        /**
        * 创建时间
        */
        public static final String createTime = "create_time";
        /**
        * 创建者ID
        */
        public static final String creatorId = "creator_id";
        /**
        * 创建者名称@(用户名)
        */
        public static final String creatorName = "creator_name";
        /**
        * 修改时间
        */
        public static final String modifyTime = "modify_time";
        /**
        * 修改者ID
        */
        public static final String modifierId = "modifier_id";
        /**
        * 修改者名称@(用户名)
        */
        public static final String modifierName = "modifier_name";
        /**
        * 所属企业ID@(同时用于数据权限过滤)
        */
        public static final String entId = "ent_id";
        /**
        * 所属企业名称
        */
        public static final String entName = "ent_name";
        /**
        * 角色代码
        */
        public static final String roleCode = "role_code";
        /**
        * 资源代码
        */
        public static final String resourceCode = "resource_code";
        /**
        * 资源权限
        */
        public static final String resourcePermission = "resource_permission";
    }

    /**
     * id@(SnowflakeId)
     */
    private Long id;

    /**
     * 记录状态@(0:删除,1:正常)
     */
    private String status;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 创建者ID
     */
    @TableField("creator_id")
    private Long creatorId;

    /**
     * 创建者名称@(用户名)
     */
    @TableField("creator_name")
    private String creatorName;

    /**
     * 修改时间
     */
    @TableField("modify_time")
    private LocalDateTime modifyTime;

    /**
     * 修改者ID
     */
    @TableField("modifier_id")
    private Long modifierId;

    /**
     * 修改者名称@(用户名)
     */
    @TableField("modifier_name")
    private String modifierName;

    /**
     * 所属企业ID@(同时用于数据权限过滤)
     */
    @TableField("ent_id")
    private Long entId;

    /**
     * 所属企业名称
     */
    @TableField("ent_name")
    private String entName;

    /**
     * 角色代码
     */
    @TableField("role_code")
    private String roleCode;

    /**
     * 资源代码
     */
    @TableField("resource_code")
    private String resourceCode;

    /**
     * 资源权限
     */
    @TableField("resource_permission")
    private String resourcePermission;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public Long getEntId() {
        return entId;
    }

    public void setEntId(Long entId) {
        this.entId = entId;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourcePermission() {
        return resourcePermission;
    }

    public void setResourcePermission(String resourcePermission) {
        this.resourcePermission = resourcePermission;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "IdpRoleResourceMap{" +
        "id=" + id +
        ", status=" + status +
        ", createTime=" + createTime +
        ", creatorId=" + creatorId +
        ", creatorName=" + creatorName +
        ", modifyTime=" + modifyTime +
        ", modifierId=" + modifierId +
        ", modifierName=" + modifierName +
        ", entId=" + entId +
        ", entName=" + entName +
        ", roleCode=" + roleCode +
        ", resourceCode=" + resourceCode +
        ", resourcePermission=" + resourcePermission +
        "}";
    }
}
