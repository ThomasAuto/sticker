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
    private String cost;

    /**
     * 收入
     */
    private String income;

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

    public List<RecordDayVO> getRecordDayVOS() {
        return recordDayVOS;
    }

    public void setRecordDayVOS(List<RecordDayVO> recordDayVOS) {
        this.recordDayVOS = recordDayVOS;
    }
}
