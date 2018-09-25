package test.domain;

import java.util.Date;

public class User {
    private Integer id;

    private String ip;

    private Integer cardNo;

    private Integer appType;

    private Integer warnNo;

    private String warnTime;

    private String durationTime;

    private String warnInfo;

    private String remark;

    private Date createTime;

    private Date modifyTime;

    private String warnState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getCardNo() {
        return cardNo;
    }

    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public Integer getWarnNo() {
        return warnNo;
    }

    public void setWarnNo(Integer warnNo) {
        this.warnNo = warnNo;
    }

    public String getWarnTime() {
        return warnTime;
    }

    public void setWarnTime(String warnTime) {
        this.warnTime = warnTime == null ? null : warnTime.trim();
    }

    public String getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(String durationTime) {
        this.durationTime = durationTime == null ? null : durationTime.trim();
    }

    public String getWarnInfo() {
        return warnInfo;
    }

    public void setWarnInfo(String warnInfo) {
        this.warnInfo = warnInfo == null ? null : warnInfo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getWarnState() {
        return warnState;
    }

    public void setWarnState(String warnState) {
        this.warnState = warnState == null ? null : warnState.trim();
    }
}