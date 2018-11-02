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
    private Integer cost;

    /**
     * 收入
     */
    private Integer income;

    List<Sticker> stickerList;


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public List<Sticker> getStickerList() {
        return stickerList;
    }

    public void setStickerList(List<Sticker> stickerList) {
        this.stickerList = stickerList;
    }
}
