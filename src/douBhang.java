import java.io.File;
import java.io.RandomAccessFile;

/**
 * @author 王小红 E-mail:493026465@qq.com
 * @version 创建时间：2014年12月22日 下午7:45:41 类说明
 */
public class douBhang {
	public static void main(String[] args) {
		int i = (int) (Math.random() * 10.0);
		int a;
		int b;
		i = 9 * (i + 1);
		a = i / 10;
		b = i % 10;
		System.out.println(a + b);
	}
}
