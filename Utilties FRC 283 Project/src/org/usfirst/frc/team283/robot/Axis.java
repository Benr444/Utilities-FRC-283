package org.usfirst.frc.team283.robot;

/**
 * This class is intended to map joystick axis values to the acceleration, velocity, or position of an axis
 * @author Benjamin
 *
 */
public class Axis 
{
	//CONSTANTS
	/** Putting this into the constructor makes this an acceleration mapping class */
	public final int POSITION_MAP = 0;
	/** Putting this into the constructor makes this an velocity mapping class */
	public final int VELOCITY_MAP = 1;
	/** Putting this into the constructor makes this an position mapping class */
	public final int ACCELERATION_MAP = 2;
	
	//VARIABLES
	/** The kind of mapping used by this instance of axis */
	private int mapping = -1;
	/** Value from the feedback device given by the user. Needs to be constantly updated via input(num) */
	private double feedbackValue = 0;
	/** Value the system produces as a result of it's feedback */
	private double output = 0;
	/** Value of the joystick that controls this class */
	private double joystickValue = 0;
	
	/**
	 * Key to usage:
	 * <br>		Axis.POSITION_MAP - The position of the joystick correlates to the position of the axis
	 * <br>		Axis.VELOCITY_MAP - The position of the joystick correlates to the velocity of the axis
	 * <br>		Axis.ACCELERATION_MAP - The position of the joystick correlates to the acceleration of the axis
	 * @param mappingType - Use Axis.POSITION_MAP or similar constants to set this
	 */
	public Axis(int mappingType)
	{
		this.mapping = mappingType;
	}
	
	public void input(double feedbackVal, double joystickVal)
	{
		this.feedbackValue = feedbackVal;
		this.joystickValue = joystickVal;
	}
	
	public double getInput()
	{
		return this.feedbackValue;
	}
	
	public double getOutput()
	{
		return this.output;
	}
}
