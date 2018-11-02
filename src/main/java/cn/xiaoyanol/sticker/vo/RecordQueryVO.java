package cn.xiaoyanol.sticker.vo;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2018-11-01
 * @Time: 下午12:24
 */
public class RecordQueryVO {

    private Integer id;

    private String openId;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "RecordQueryVO{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", time=" + time +
                '}';
    }
}
