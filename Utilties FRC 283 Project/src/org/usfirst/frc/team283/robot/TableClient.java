package org.usfirst.frc.team283.robot;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class TableClient 
{
	
	private NetworkTable table;
	double prev = 0;
	int count = 0;
	long zero = 0;
	
	public static void main(String[] args) 
	{
		NetworkTable.setClientMode();
		NetworkTable.setIPAddress("10.2.83.2");
		TableClient tc = new TableClient();
		tc.table = NetworkTable.getTable("table");
		tc.zero = System.currentTimeMillis();
		while (true)
		{
			double num = tc.table.getNumber("x", 0);
			if (num != tc.prev)
			{
				tc.count += 1;
			}
			tc.prev = num;
			if ((System.currentTimeMillis() - tc.zero) > 1000)
			{
				System.out.println("Updates this second: " + tc.count);
				tc.zero = System.currentTimeMillis();
				tc.count = 0;
			}
		}
	}
	
}
