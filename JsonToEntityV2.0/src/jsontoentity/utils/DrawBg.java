package jsontoentity.utils;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class DrawBg extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image image;
	public DrawBg(Image image)
	{
		this.image=image;
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setSize(width,height);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(image,0,0,this.getWidth(),this.getHeight(),this);
	}
}
