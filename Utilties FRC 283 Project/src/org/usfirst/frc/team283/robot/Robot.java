package org.usfirst.frc.team283.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Robot extends IterativeRobot
{
	NetworkTable table;
	int x;
	
	public Robot()
	{
		
	}
	
	@Override
	public void robotInit()
	{
		table = NetworkTable.getTable("table");
		x = 0;
	}
	
	@Override
	public void teleopPeriodic()
	{
		x += 1;
		table.putNumber("x", x);
	}
}
