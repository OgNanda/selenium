package com.mini;

import java.awt.Color;
import java.awt.Graphics; 

public class Bar_chart extends Mobile_comparision {
	
	 private int Amazonprice;
	   private int Flipkartprice;
	   
	   public void BarChart(int v1, int v2) {
		   Amazonprice= v1;
		      Flipkartprice = v2;
	   }
	   
	   public void paintComponent(Graphics g) {
		      super.paintComponent(g);
		      int width = getWidth();
		      int height = getHeight();
		      
		      g.setColor(Color.red);
		      g.fillRect(0, 0, (int) (Amazonprice * width / 100), height);
		 
		      g.setColor(Color.blue);
		      g.fillRect((int) (Amazonprice * width / 100), 0, (int) (Flipkartprice * width / 100), height);
		   

	}

	private int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

}
