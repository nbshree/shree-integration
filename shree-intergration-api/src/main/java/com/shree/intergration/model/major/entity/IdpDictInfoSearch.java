package com.shree.intergration.model.major.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 字典信息表, 查询对象
 * </p>
 *
 * @author shree
 * @since 2020-07-01
 */
public class IdpDictInfoSearch implements Serializable {

    /**
     * id@(SnowflakeId)
     */
    @TableField("id")
    private Long id;

    /**
     * id@(SnowflakeId) - 开始
     */
    @TableField("id")
    private Long idStart;

    /**
     * id@(SnowflakeId) - 结束
     */
    @TableField("id")
    private Long idEnd;
    /**
     * 记录状态@(0:删除,1:正常)
     */
    @TableField("status")
    private String status;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 创建时间 - 开始
     */
    @TableField("create_time")
    private LocalDateTime createTimeStart;

    /**
     * 创建时间 - 结束
     */
    @TableField("create_time")
    private LocalDateTime createTimeEnd;
    /**
     * 创建者ID
     */
    @TableField("creator_id")
    private Long creatorId;

    /**
     * 创建者ID - 开始
     */
    @TableField("creator_id")
    private Long creatorIdStart;

    /**
     * 创建者ID - 结束
     */
    @TableField("creator_id")
    private Long creatorIdEnd;
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
     * 修改时间 - 开始
     */
    @TableField("modify_time")
    private LocalDateTime modifyTimeStart;

    /**
     * 修改时间 - 结束
     */
    @TableField("modify_time")
    private LocalDateTime modifyTimeEnd;
    /**
     * 修改者ID
     */
    @TableField("modifier_id")
    private Long modifierId;

    /**
     * 修改者ID - 开始
     */
    @TableField("modifier_id")
    private Long modifierIdStart;

    /**
     * 修改者ID - 结束
     */
    @TableField("modifier_id")
    private Long modifierIdEnd;
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
     * 所属企业ID@(同时用于数据权限过滤) - 开始
     */
    @TableField("ent_id")
    private Long entIdStart;

    /**
     * 所属企业ID@(同时用于数据权限过滤) - 结束
     */
    @TableField("ent_id")
    private Long entIdEnd;
    /**
     * 所属企业名称
     */
    @TableField("ent_name")
    private String entName;

    /**
     * 父级ID
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 父级ID - 开始
     */
    @TableField("parent_id")
    private Long parentIdStart;

    /**
     * 父级ID - 结束
     */
    @TableField("parent_id")
    private Long parentIdEnd;
    /**
     * 字典类型代码
     */
    @TableField("dict_type_code")
    private String dictTypeCode;

    /**
     * 字典类型名称
     */
    @TableField("dict_type_name")
    private String dictTypeName;

    /**
     * 字典代码
     */
    @TableField("dict_code")
    private String dictCode;

    /**
     * 字典名称
     */
    @TableField("dict_name")
    private String dictName;

    /**
     * 字典键值
     */
    @TableField("dict_value")
    private String dictValue;

    /**
     * 是否启用字典@(0:否,1:是)
     */
    @TableField("dict_enabled")
    private String dictEnabled;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 排序
     */
    @TableField("sort")
    private String sort;

    /**
     * 是否为开放字典@(0:否,1:是)
     */
    @TableField("public_flag")
    private String publicFlag;

    /**
     * 是否为系统级字典@(0:否,1:是)
     */
    @TableField("system_flag")
    private String systemFlag;


    /**
     * 获取: id@(SnowflakeId)
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置: id@(SnowflakeId)
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取: id@(SnowflakeId) - 开始
     */
    public Long getIdStart() {
        return idStart;
    }

    /**
     * 设置: id@(SnowflakeId) - 开始
     */
    public void setIdStart(Long id) {
        this.idStart = id;
    }

    /**
     * 获取: id@(SnowflakeId) - 结束
     */
    public Long getIdEnd() {
        return idEnd;
    }

    /**
     * 设置: id@(SnowflakeId) - 结束
     */
    public void setIdEnd(Long id) {
        this.idEnd = id;
        }
    /**
     * 获取: 记录状态@(0:删除,1:正常)
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置: 记录状态@(0:删除,1:正常)
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取: 创建时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置: 创建时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取: 创建时间 - 开始
     */
    public LocalDateTime getCreateTimeStart() {
        return createTimeStart;
    }

    /**
     * 设置: 创建时间 - 开始
     */
    public void setCreateTimeStart(LocalDateTime createTime) {
        this.createTimeStart = createTime;
    }

    /**
     * 获取: 创建时间 - 结束
     */
    public LocalDateTime getCreateTimeEnd() {
        return createTimeEnd;
    }

    /**
     * 设置: 创建时间 - 结束
     */
    public void setCreateTimeEnd(LocalDateTime createTime) {
        this.createTimeEnd = createTime;
        }
    /**
     * 获取: 创建者ID
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置: 创建者ID
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取: 创建者ID - 开始
     */
    public Long getCreatorIdStart() {
        return creatorIdStart;
    }

    /**
     * 设置: 创建者ID - 开始
     */
    public void setCreatorIdStart(Long creatorId) {
        this.creatorIdStart = creatorId;
    }

    /**
     * 获取: 创建者ID - 结束
     */
    public Long getCreatorIdEnd() {
        return creatorIdEnd;
    }

    /**
     * 设置: 创建者ID - 结束
     */
    public void setCreatorIdEnd(Long creatorId) {
        this.creatorIdEnd = creatorId;
        }
    /**
     * 获取: 创建者名称@(用户名)
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * 设置: 创建者名称@(用户名)
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    /**
     * 获取: 修改时间
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置: 修改时间
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取: 修改时间 - 开始
     */
    public LocalDateTime getModifyTimeStart() {
        return modifyTimeStart;
    }

    /**
     * 设置: 修改时间 - 开始
     */
    public void setModifyTimeStart(LocalDateTime modifyTime) {
        this.modifyTimeStart = modifyTime;
    }

    /**
     * 获取: 修改时间 - 结束
     */
    public LocalDateTime getModifyTimeEnd() {
        return modifyTimeEnd;
    }

    /**
     * 设置: 修改时间 - 结束
     */
    public void setModifyTimeEnd(LocalDateTime modifyTime) {
        this.modifyTimeEnd = modifyTime;
        }
    /**
     * 获取: 修改者ID
     */
    public Long getModifierId() {
        return modifierId;
    }

    /**
     * 设置: 修改者ID
     */
    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * 获取: 修改者ID - 开始
     */
    public Long getModifierIdStart() {
        return modifierIdStart;
    }

    /**
     * 设置: 修改者ID - 开始
     */
    public void setModifierIdStart(Long modifierId) {
        this.modifierIdStart = modifierId;
    }

    /**
     * 获取: 修改者ID - 结束
     */
    public Long getModifierIdEnd() {
        return modifierIdEnd;
    }

    /**
     * 设置: 修改者ID - 结束
     */
    public void setModifierIdEnd(Long modifierId) {
        this.modifierIdEnd = modifierId;
        }
    /**
     * 获取: 修改者名称@(用户名)
     */
    public String getModifierName() {
        return modifierName;
    }

    /**
     * 设置: 修改者名称@(用户名)
     */
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    /**
     * 获取: 所属企业ID@(同时用于数据权限过滤)
     */
    public Long getEntId() {
        return entId;
    }

    /**
     * 设置: 所属企业ID@(同时用于数据权限过滤)
     */
    public void setEntId(Long entId) {
        this.entId = entId;
    }

    /**
     * 获取: 所属企业ID@(同时用于数据权限过滤) - 开始
     */
    public Long getEntIdStart() {
        return entIdStart;
    }

    /**
     * 设置: 所属企业ID@(同时用于数据权限过滤) - 开始
     */
    public void setEntIdStart(Long entId) {
        this.entIdStart = entId;
    }

    /**
     * 获取: 所属企业ID@(同时用于数据权限过滤) - 结束
     */
    public Long getEntIdEnd() {
        return entIdEnd;
    }

    /**
     * 设置: 所属企业ID@(同时用于数据权限过滤) - 结束
     */
    public void setEntIdEnd(Long entId) {
        this.entIdEnd = entId;
        }
    /**
     * 获取: 所属企业名称
     */
    public String getEntName() {
        return entName;
    }

    /**
     * 设置: 所属企业名称
     */
    public void setEntName(String entName) {
        this.entName = entName;
    }

    /**
     * 获取: 父级ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置: 父级ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取: 父级ID - 开始
     */
    public Long getParentIdStart() {
        return parentIdStart;
    }

    /**
     * 设置: 父级ID - 开始
     */
    public void setParentIdStart(Long parentId) {
        this.parentIdStart = parentId;
    }

    /**
     * 获取: 父级ID - 结束
     */
    public Long getParentIdEnd() {
        return parentIdEnd;
    }

    /**
     * 设置: 父级ID - 结束
     */
    public void setParentIdEnd(Long parentId) {
        this.parentIdEnd = parentId;
        }
    /**
     * 获取: 字典类型代码
     */
    public String getDictTypeCode() {
        return dictTypeCode;
    }

    /**
     * 设置: 字典类型代码
     */
    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    /**
     * 获取: 字典类型名称
     */
    public String getDictTypeName() {
        return dictTypeName;
    }

    /**
     * 设置: 字典类型名称
     */
    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
    }

    /**
     * 获取: 字典代码
     */
    public String getDictCode() {
        return dictCode;
    }

    /**
     * 设置: 字典代码
     */
    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    /**
     * 获取: 字典名称
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * 设置: 字典名称
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    /**
     * 获取: 字典键值
     */
    public String getDictValue() {
        return dictValue;
    }

    /**
     * 设置: 字典键值
     */
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    /**
     * 获取: 是否启用字典@(0:否,1:是)
     */
    public String getDictEnabled() {
        return dictEnabled;
    }

    /**
     * 设置: 是否启用字典@(0:否,1:是)
     */
    public void setDictEnabled(String dictEnabled) {
        this.dictEnabled = dictEnabled;
    }

    /**
     * 获取: 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置: 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取: 排序
     */
    public String getSort() {
        return sort;
    }

    /**
     * 设置: 排序
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * 获取: 是否为开放字典@(0:否,1:是)
     */
    public String getPublicFlag() {
        return publicFlag;
    }

    /**
     * 设置: 是否为开放字典@(0:否,1:是)
     */
    public void setPublicFlag(String publicFlag) {
        this.publicFlag = publicFlag;
    }

    /**
     * 获取: 是否为系统级字典@(0:否,1:是)
     */
    public String getSystemFlag() {
        return systemFlag;
    }

    /**
     * 设置: 是否为系统级字典@(0:否,1:是)
     */
    public void setSystemFlag(String systemFlag) {
        this.systemFlag = systemFlag;
    }

}