package T4;
/**
 * @author  王小红  E-mail:493026465@qq.com
 * @version 创建时间：2014年12月14日 下午3:47:12
 * 类说明
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class FontDialog extends JDialog implements ItemListener,ActionListener {
   FontFamilyNames fontFamilyNames; 
   int fontSize=38;
   static int fontStlye=Font.PLAIN;
   String fontName;
   JComboBox fontNameList,fontSizeList,fontStyleList;
   JLabel label;
   Font font;
   JButton yes,cancel;
   static int YES=1,NO=0;
   int state=-1;
   FontDialog(JFrame f) { 
      super(f);
      setTitle("字体对话框");
      font=new Font("宋体",Font.PLAIN,12);
      fontFamilyNames=new FontFamilyNames();
      setModal(true); //当前对话框调用setModal(boolean b)设置为有模式
      yes=new JButton("Yes"); 
      cancel=new JButton("cancel");  
      yes.addActionListener(this);
      cancel.addActionListener(this);
      label=new JLabel("hello,奥运",JLabel.CENTER);               
      fontNameList=new JComboBox();
      fontSizeList=new JComboBox();
      fontStyleList=new JComboBox();
      String name[]=fontFamilyNames.getFontName();
      fontNameList.addItem("字体");
      for(int k=0;k<name.length;k++)
         fontNameList.addItem(name[k]);
      fontSizeList.addItem("大小");
      for(int k=8;k<72;k=k+2)
         fontSizeList.addItem(new Integer(k));
      fontStyleList.addItem("字形");
      
      fontStyleList.addItem("常規");
      fontStyleList.addItem("加重");
      fontStyleList.addItem("斜體");
      fontStyleList.addItem("常規+加重");
      fontStyleList.addItem("常規+斜體");
      fontStyleList.addItem("斜體+加重");
      fontStyleList.addItem("常規+斜體+加重");
      
      fontNameList.addItemListener(this);
      fontSizeList.addItemListener(this);
      fontStyleList.addItemListener(this);
      JPanel pNorth=new JPanel();
      pNorth.add(fontNameList);
      pNorth.add(fontSizeList);
      pNorth.add(fontStyleList);
      add(pNorth,BorderLayout.NORTH);
      add(label,BorderLayout.CENTER);
      JPanel pSouth=new JPanel();
      pSouth.add(yes); 
      pSouth.add(cancel);
      add(pSouth,BorderLayout.SOUTH);
      setBounds(100,100,280,170);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      validate();
   }
   public void itemStateChanged(ItemEvent e) {
      if(e.getSource()==fontNameList) {     
         fontName=(String)fontNameList.getSelectedItem();
         font=new Font(fontName,fontStlye,fontSize);
      }
      else if(e.getSource()==fontSizeList) {     
         Integer m=(Integer)fontSizeList.getSelectedItem();
         fontSize=m.intValue();
         font=new Font(fontName,fontStlye,fontSize);
      }
      else if(e.getSource()==fontStyleList){
    	  int index = fontStyleList.getSelectedIndex();
    	  switch (index) {
		case 1:
			fontStlye=Font.PLAIN;
			break;
		case 2:
			fontStlye=Font.BOLD;
			break;
		case 3:
			fontStlye=Font.ITALIC;
			break;
		case 4:
			fontStlye=Font.PLAIN+Font.BOLD;
			break;
		case 5:
			fontStlye=Font.PLAIN+Font.ITALIC;
			break;
		case 6:
			fontStlye=Font.BOLD+Font.ITALIC;
			break;
		case 7:
			fontStlye=Font.BOLD+Font.ITALIC+Font.PLAIN;	
			break;
		default:
			break;
		}
    	  font=new Font(fontName,fontStlye,fontSize);
      }
      label.setFont(font);
      label.repaint();
      validate();
   }
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==yes) {
          state=YES;  
          setVisible(false);        //对话框设置为不可见
      }
      else if(e.getSource()==cancel) {
         state=NO;  
         setVisible(false);        //对话框设置为不可见
      }
   }
   public int getState() {
      return state;
   }
   public Font getFont() {
      return font;
   }
} 


