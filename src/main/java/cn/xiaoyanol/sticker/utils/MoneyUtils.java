package cn.xiaoyanol.sticker.utils;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2018-11-03
 * @Time: 下午4:41
 */
public class MoneyUtils {
    /**
     * 分转元，两位小数
     * @param money
     * @return
     */
    public static String convertCentToYuan(Integer money) {
        Double d = new Double(money/100);
        return String.format("%.2f", new Object[]{d});
    }

    public static void main(String[] args) {
        System.out.println(convertCentToYuan(100));
    }
}
