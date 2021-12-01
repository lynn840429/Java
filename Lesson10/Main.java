import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /**
         * 获取当前日期
         */
        Date date = new Date();
        System.out.println(date.toString());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toString());

        // 获得年份
        int year = calendar.get(Calendar.YEAR);
        // 获得月份
        int month = calendar.get(Calendar.MONTH) + 1;
        // 获得日期
        int cdate = calendar.get(Calendar.DATE);
        // 获得小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        // 获得分钟
        int minute = calendar.get(Calendar.MINUTE);
        // 获得秒
        int second = calendar.get(Calendar.SECOND);
        // 获得星期几（1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(year + "年" + month + "月" + cdate + "日 " + hour + "时" + minute + "分" + second + "秒");

        /**
         * 日期格式化输出
         */
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(format.format(date));

        /**
         * 日期比较
         */
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        date1.set(2017, 1, 1);  // 2017/02/01
        date2.set(2018, 1, 1);  // 2018/02/01
        //date1的日期在date2的前面吗？
        if (date1.before(date2)) {
            System.out.println("date1在date2之前");
        }

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try
        {
            Date d1 = df.parse("2004-03-26 13:31:40");
            Date d2 = df.parse("2004-01-02 11:30:24");
            long diff = d1.getTime() - d2.getTime();
            long days = diff / (1000 * 60 * 60 * 24);
            System.out.println("diff" + format.format(diff));
            System.out.println("days" + format.format(days));
        }
        catch (Exception e)
        {
        }
    }
}