package cn.xiaoyanol.sticker.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * sticker_sticker
 * @author 
 */
public class Sticker implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 用户Id
     */
    private Integer userId;

    /**
     * 趣图
     */
    private String happyUrl;

    /**
     * 今日已用
     */
    private Integer todayUsed;

    /**
     * 已用额度
     */
    private Integer usedQuota;

    /**
     * 剩余额度
     */
    private Integer surplusQuota;

    /**
     * 总额度
     */
    private Integer totalQuota;

    /**
     * 更新时间
     */
    private Date ctime;

    /**
     * 更新时间
     */
    private Date utime;

    /**
     * 是否有效 0- 无效， 1-有效
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHappyUrl() {
        return happyUrl;
    }

    public void setHappyUrl(String happyUrl) {
        this.happyUrl = happyUrl;
    }

    public Integer getTodayUsed() {
        return todayUsed;
    }

    public void setTodayUsed(Integer todayUsed) {
        this.todayUsed = todayUsed;
    }

    public Integer getUsedQuota() {
        return usedQuota;
    }

    public void setUsedQuota(Integer usedQuota) {
        this.usedQuota = usedQuota;
    }

    public Integer getSurplusQuota() {
        return surplusQuota;
    }

    public void setSurplusQuota(Integer surplusQuota) {
        this.surplusQuota = surplusQuota;
    }

    public Integer getTotalQuota() {
        return totalQuota;
    }

    public void setTotalQuota(Integer totalQuota) {
        this.totalQuota = totalQuota;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Sticker other = (Sticker) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getHappyUrl() == null ? other.getHappyUrl() == null : this.getHappyUrl().equals(other.getHappyUrl()))
            && (this.getTodayUsed() == null ? other.getTodayUsed() == null : this.getTodayUsed().equals(other.getTodayUsed()))
            && (this.getUsedQuota() == null ? other.getUsedQuota() == null : this.getUsedQuota().equals(other.getUsedQuota()))
            && (this.getSurplusQuota() == null ? other.getSurplusQuota() == null : this.getSurplusQuota().equals(other.getSurplusQuota()))
            && (this.getTotalQuota() == null ? other.getTotalQuota() == null : this.getTotalQuota().equals(other.getTotalQuota()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getUtime() == null ? other.getUtime() == null : this.getUtime().equals(other.getUtime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getHappyUrl() == null) ? 0 : getHappyUrl().hashCode());
        result = prime * result + ((getTodayUsed() == null) ? 0 : getTodayUsed().hashCode());
        result = prime * result + ((getUsedQuota() == null) ? 0 : getUsedQuota().hashCode());
        result = prime * result + ((getSurplusQuota() == null) ? 0 : getSurplusQuota().hashCode());
        result = prime * result + ((getTotalQuota() == null) ? 0 : getTotalQuota().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getUtime() == null) ? 0 : getUtime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", happyUrl=").append(happyUrl);
        sb.append(", todayUsed=").append(todayUsed);
        sb.append(", usedQuota=").append(usedQuota);
        sb.append(", surplusQuota=").append(surplusQuota);
        sb.append(", totalQuota=").append(totalQuota);
        sb.append(", ctime=").append(ctime);
        sb.append(", utime=").append(utime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}