package org.usfirst.frc.team5905.robot;
import edu.wpi.first.wpilibj.*;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static RobotDrive drive;
	
	public static final double robotSpeed = 1;
	public static final int RIGHT_GAMEPAD_JOYSTICK_Y = 5;
	public static final int LEFT_GAMEPAD_JOYSTICK_Y = 1;
	public static final int INTAKE_SPEED = 1;

	
    public static SpeedController FRONT_RIGHT_SPEED_CONTROLLER;
    public static SpeedController BACK_RIGHT_SPEED_CONTROLLER;
    public static SpeedController FRONT_LEFT_SPEED_CONTROLLER;
    public static SpeedController BACK_LEFT_SPEED_CONTROLLER;
    public static SpeedController ARM_RIGHT_SPEED_CONTROLLER;
    public static SpeedController ARM_LEFT_SPEED_CONTROLLER;
	
	public static void init(){
		
		FRONT_LEFT_SPEED_CONTROLLER = new Victor(0);
	    BACK_LEFT_SPEED_CONTROLLER = new Victor(1);
	    FRONT_RIGHT_SPEED_CONTROLLER = new Victor(2);
	    BACK_RIGHT_SPEED_CONTROLLER = new Victor(3);
	    ARM_LEFT_SPEED_CONTROLLER = new Victor(4);
	    ARM_RIGHT_SPEED_CONTROLLER = new Victor(5);
			
		drive = new RobotDrive(0, 1, 2, 3); 
		
	}
	
}
