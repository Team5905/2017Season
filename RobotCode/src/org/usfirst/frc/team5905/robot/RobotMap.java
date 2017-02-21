package org.usfirst.frc.team5905.robot;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class RobotMap {
    
	public static RobotDrive drive;
	
	public static final int RIGHT_GAMEPAD_JOYSTICK_Y = 5;
	public static final int LEFT_GAMEPAD_JOYSTICK_Y = 1;
	public static final double DRIVE_SPEED = 1;
	public static double SHOOT_SPEED = 1;
	public static double INTAKE_SPEED = 0.3;
	public static int TURN_SPEED = 1;
	public static final double CLIMB_SPEED = 0.2;
	public static double DISTANCE_PER_PULSE = (5 * 3.14159)/(4096 * 5.25); //0.00073
	
	public static boolean TURN_DIRECTION = true; //Right for true, left for false
	public static double TURN_AMOUNT = 1; 
	public static double STRAIGHT_DISTANCE = 1; //Helps toggle for reverse Command

    public static int STRAIGHT = 1;
    
    public static double AREA_DIFFERENCE = 0;
    public static double AREA_AVG = 0.5;

    public static SpeedController FRONT_RIGHT_SPEED_CONTROLLER;
    public static SpeedController BACK_RIGHT_SPEED_CONTROLLER;
    public static SpeedController FRONT_LEFT_SPEED_CONTROLLER;
    public static SpeedController BACK_LEFT_SPEED_CONTROLLER;
    public static SpeedController INTAKE_CONTROLLER;
    public static SpeedController CLIMB_CONTROLLER;
    public static SpeedController SHOOTER_CONTROLLER; 
    public static SmartDashboard SMART_DASHBOARD = new SmartDashboard();
    
    public static Encoder LEFT_DRIVE_ENCODER;
    public static Encoder RIGHT_DRIVE_ENCODER;

    public static ADXRS450_Gyro driveTrainGyro;
	
	public static void init(){
		
		LEFT_DRIVE_ENCODER = new Encoder(2,3, false, EncodingType.k4X);
		RIGHT_DRIVE_ENCODER = new Encoder(0,1, false, EncodingType.k4X);
		FRONT_LEFT_SPEED_CONTROLLER = new Victor(3);
		//LiveWindow.addActuator("Check", "FRONT_LEFT_SPEED_CONTROLLER", (Victor) FRONT_LEFT_SPEED_CONTROLLER);
	    BACK_LEFT_SPEED_CONTROLLER = new Victor(4);
	    //LiveWindow.addActuator("Check", "BACK_LEFT_SPEED_CONTROLLER", (Victor) BACK_LEFT_SPEED_CONTROLLER);
	    FRONT_RIGHT_SPEED_CONTROLLER = new Victor(1);
	    //LiveWindow.addActuator("Check", "FRONT_RIGHT_SPEED_CONTROLLER", (Victor) FRONT_RIGHT_SPEED_CONTROLLER);
	    BACK_RIGHT_SPEED_CONTROLLER = new Victor(2);
	    //LiveWindow.addActuator("Check", "BACK_RIGHT	_SPEED_CONTROLLER", (Victor) BACK_RIGHT_SPEED_CONTROLLER);
	    INTAKE_CONTROLLER = new Victor(5);
	    //LiveWindow.addActuator("Check", "INTAKE_CONTROLLER", (Victor) INTAKE_CONTROLLER);
	    SHOOTER_CONTROLLER = new Victor(6);
	    CLIMB_CONTROLLER = new Victor(7);
			
		drive = new RobotDrive(FRONT_LEFT_SPEED_CONTROLLER, BACK_LEFT_SPEED_CONTROLLER, FRONT_RIGHT_SPEED_CONTROLLER, BACK_RIGHT_SPEED_CONTROLLER); 
		drive.setMaxOutput(0.2);
		
		driveTrainGyro = new ADXRS450_Gyro();
	}
	
	
  
}