package org.usfirst.frc.team5905;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

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
    public static SpeedController shooterSpeedController;
    public static SpeedController turretSpeedController;
    public static Encoder turretEncoder;
	
	public static void init(){
		
		FRONT_LEFT_SPEED_CONTROLLER = new Victor(0);
	    BACK_LEFT_SPEED_CONTROLLER = new Victor(1);
	    FRONT_RIGHT_SPEED_CONTROLLER = new Victor(2);
	    BACK_RIGHT_SPEED_CONTROLLER = new Victor(3);
	    INTAKE_CONTROLLER = new Victor(4);
	    ELEVATOR_CONTROLLER = new Victor(5);
	    shooterSpeedController = new TalonSRX(0);
        LiveWindow.addActuator("Shooter", "SpeedController", (TalonSRX) shooterSpeedController);

        turretSpeedController = new TalonSRX(1);
        LiveWindow.addActuator("Turret", "SpeedController", (TalonSRX) turretSpeedController);

        turretEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Turret", "Encoder", turretEncoder);
        turretEncoder.setDistancePerPulse(1.0);
        turretEncoder.setPIDSourceType(PIDSourceType.kRate);

	    SHOOTER_CONTROLLER = new Victor(6);
	    TURRET_CONTROLLER = new Victor(7);
			
		drive = new RobotDrive(0, 1, 2, 3); 
		
	}
  
}
