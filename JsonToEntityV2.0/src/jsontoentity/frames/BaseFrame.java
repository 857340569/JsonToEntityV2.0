package jsontoentity.frames;

import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import jsontoentity.utils.DrawBg;

public class BaseFrame extends JFrame{
	protected Toolkit tookit;
	protected int height;
	protected int width;
	
	public BaseFrame() {
		tookit=Toolkit.getDefaultToolkit();
		width=tookit.getScreenSize().width;
		height=tookit.getScreenSize().height;
	}
	/**
	 * 创建有背景图片的panel
	 * @param imgAbsPath
	 * @return
	 */
	protected DrawBg createImgBgPanel(String imgPath)
	{
		return createImgBgPanel(new ImageIcon(imgPath));
	}
	
	/**
	 * 在插件环境中获取图片内容,未获取成功
	 * @param imagePath
	 * @return
	 */
	@Deprecated
	protected ImageIcon getImageInPluginsEnv(String imagePath) {
		String pluginId="JsonToEntityV2.0";
		ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(pluginId,imagePath);
		ImageIcon imageIcon=new ImageIcon(descriptor.getImageData().data);
		return imageIcon;
	}

	/**
	 * 获取图片工程中图片
	 * @param imagePath 注意/images/main_bg.jpg 与 images/main_bg.jpg 不同
	 * 					多一个"/" 表示类路径（包括包名）所在的位置 。打包成jar 也必须要用"/"
	 * 					否则表示<包名(jsontoentity/frames)/images/main_bg.jpg>
	 * @return
	 */
	protected ImageIcon getImageIcon(String imagePath) {
		ImageIcon imageIcon=new ImageIcon(getClass().getResource(imagePath));
		return imageIcon;
	}
	protected DrawBg createImgBgPanel(ImageIcon image)
	{
		DrawBg drawBg=new DrawBg(image.getImage());
		return drawBg;
	}
	@Override
	public void setSize(int width, int height) {
		super.setSize(width, height);
		setFrameCenter();
	}
	/**
	 * 设置frame显示在屏幕中心位置
	 */
	protected void setFrameCenter()
	{
		setLocation(width/2-getWidth()/2, height/2-getHeight()/2);
	}
	/**
	 *创建图片按钮
	 */
	protected JButton createImgBtn(String imgPath) {
		return new JButton(new ImageIcon(imgPath));
	}
	
}
