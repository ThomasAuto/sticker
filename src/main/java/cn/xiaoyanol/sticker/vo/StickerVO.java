package cn.xiaoyanol.sticker.vo;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2018-11-01
 * @Time: 下午12:49
 */
public class StickerVO {

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
     * 花费
     */
    private Integer amount;

    /**
     * 使用途径
     */
    private String content;

    /**
     * 使用时间
     */
    private Date usedTime;

    /**
     * 创建时间
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

    /**
     * 支出收入标识 true 支出 false 收入
     */
    private Boolean outFlag;


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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
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

    public Integer getId() {
        return id;
    }

    public Boolean getOutFlag() {
        return outFlag;
    }

    public void setOutFlag(Boolean outFlag) {
        this.outFlag = outFlag;
    }
}
