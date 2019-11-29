import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.Icon;
import javax.swing.JFrame;

public class OSymbol implements Symbol,Icon
{
	private String symbol;
	private int width;
	private int height;

	public OSymbol(int theWidth, int theHeight)
	{
		symbol = "O";
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
		g2.drawOval(10, 5, width, height);
	
	}
	


}


