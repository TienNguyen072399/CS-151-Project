import java.awt.BasicStroke;
import java.awt.Color;
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
		g2.setColor(Color.RED);
		g2.setStroke(new BasicStroke(4));
		g2.drawLine(5, 5, width + 20, height + 5);
		g2.drawLine(width + 20, 5, 5, height + 2);
	
	}
	


}


