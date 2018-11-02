package cn.xiaoyanol.sticker.vo;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2018-11-01
 * @Time: 下午12:27
 */
public class RecordVO {

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

    /**
     * 详细记录
     */
    private List<RecordDayVO> recordDayVOS;


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

    public List<RecordDayVO> getRecordDayVOS() {
        return recordDayVOS;
    }

    public void setRecordDayVOS(List<RecordDayVO> recordDayVOS) {
        this.recordDayVOS = recordDayVOS;
    }
}
