package cn.xiaoyanol.sticker.vo;

import cn.xiaoyanol.sticker.domain.Sticker;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2018-11-01
 * @Time: 下午1:56
 */
public class RecordDayVO {

    /**
     * 当前时间
     */
    private Date time;

    /**
     * 支出
     */
    private String cost;

    /**
     * 收入
     */
    private String income;

    List<Sticker> stickerList;


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public List<Sticker> getStickerList() {
        return stickerList;
    }

    public void setStickerList(List<Sticker> stickerList) {
        this.stickerList = stickerList;
    }
}
