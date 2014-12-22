package T2;
/**
 * @author  王小红  E-mail:493026465@qq.com
 * @version 创建时间：2014年12月14日 下午3:03:26
 * 类说明
 */
public class CalendarMainClass {
	   public static void main(String args[]) {
	      CalendarFrame frame=new CalendarFrame();
	      frame.setBounds(100,100,360,300);
	      frame.setVisible(true);
	      frame.setYearAndMonth(2015,5); 
	   }
	}
