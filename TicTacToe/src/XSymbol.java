import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.Icon;
import javax.swing.JFrame;

public class XSymbol implements Symbol,Icon
{
	private String symbol;
	private int width;
	private int height;

	public XSymbol(int theWidth, int theHeight)
	{
		symbol = "X";
		width = theWidth;
		height = theHeight;
	}
	
	public String getSymbol() 
	{
		return symbol;
	}
	
	public int getIconHeight() 
	{
		return height;
	}


	public int getIconWidth() 
	{
		return width;
	}

	public void paintIcon(Component arg0, Graphics g, int arg2, int arg3) 
	{
		  Graphics2D g2 = (Graphics2D) g;
		  this.draw(g2);
	}

	public void draw(Graphics2D g2) 
	{
		g2.drawLine(0, 0, 500/3, 500/3);
		g2.drawLine(500/3, 0, 0, 500/3);
	}
	


}


