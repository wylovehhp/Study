package T3;
/**
 * @author  王小红  E-mail:493026465@qq.com
 * @version 创建时间：2014年12月14日 下午3:29:45
 * 类说明
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LetterLabel extends JTextField implements FocusListener {
   LetterLabel() {
      setEditable(false);
      addFocusListener(this);//将当前对象注册为自身的焦点视器
      setBackground(Color.white);
      setFont(new Font("Arial",Font.PLAIN,30));
   }  
   public static  LetterLabel[] getLetterLabel(int n) {
      LetterLabel a[]=new LetterLabel[n];
      for(int k=0;k<a.length;k++)
         a[k]=new LetterLabel();
      return a;
   }
   public void focusGained(FocusEvent e) {
      setBackground(Color.cyan);
   }
   public void focusLost(FocusEvent e) {
      setBackground(Color.white);
   }
   public void setText(char c) {
      setText(""+c);
   }
}
