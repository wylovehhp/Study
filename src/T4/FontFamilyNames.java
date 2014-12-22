package T4;
/**
 * @author  王小红  E-mail:493026465@qq.com
 * @version 创建时间：2014年12月14日 下午3:46:43
 * 类说明
 */
import java.awt.GraphicsEnvironment;
public class FontFamilyNames {
    String allFontNames[];
    public String [] getFontName() {
      GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
      allFontNames=ge.getAvailableFontFamilyNames();
      return allFontNames;
    }
}
