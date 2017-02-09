package org.usfirst.frc.team5905.robot;
import edu.wpi.first.wpilibj.*;

public class RobotMap {

	public static RobotDrive drive;
	
	public static final int RIGHT_GAMEPAD_JOYSTICK_Y = 5;
	public static final int LEFT_GAMEPAD_JOYSTICK_Y = 1;
	public static final int TURRET_GAMEPAD_JOYSTICK = 2;
	public static final double DRIVE_SPEED = 1;
	public static final int INTAKE_SPEED = 1;
	public static final int ELEVATOR_SPEED = 1;

	
    public static SpeedController FRONT_RIGHT_SPEED_CONTROLLER;
    public static SpeedController BACK_RIGHT_SPEED_CONTROLLER;
    public static SpeedController FRONT_LEFT_SPEED_CONTROLLER;
    public static SpeedController BACK_LEFT_SPEED_CONTROLLER;
    public static SpeedController INTAKE_CONTROLLER;
    public static SpeedController ELEVATOR_CONTROLLER;
    public static SpeedController SHOOTER_CONTROLLER;
    public static SpeedController TURRET_CONTROLLER;
	
	public static void init(){
		
		FRONT_LEFT_SPEED_CONTROLLER = new Victor(0);
	    BACK_LEFT_SPEED_CONTROLLER = new Victor(1);
	    FRONT_RIGHT_SPEED_CONTROLLER = new Victor(2);
	    BACK_RIGHT_SPEED_CONTROLLER = new Victor(3);
	    INTAKE_CONTROLLER = new Victor(4);
	    ELEVATOR_CONTROLLER = new Victor(5);
	    SHOOTER_CONTROLLER = new Victor(6);
	    TURRET_CONTROLLER = new Victor(7);
			
		drive = new RobotDrive(0, 1, 2, 3); 
		
	}
	
}
