package org.usfirst.frc.team5905.robot;
import edu.wpi.first.wpilibj.*;

public class RobotMap {
    
    public static RobotDrive drive;
    
    public static final double robotSpeed = 1;
    public static final int RIGHT_GAMEPAD_JOYSTICK_Y = 5;
    public static final int LEFT_GAMEPAD_JOYSTICK_Y = 1;
    public static final int INTAKE_SPEED = 1;
    public static final int ELEVATOR_SPEED = 1;
    
    
    public static SpeedController FRONT_RIGHT_SPEED_CONTROLLER;
    public static SpeedController BACK_RIGHT_SPEED_CONTROLLER;
    public static SpeedController FRONT_LEFT_SPEED_CONTROLLER;
    public static SpeedController BACK_LEFT_SPEED_CONTROLLER;
    public static SpeedController ARM_RIGHT_SPEED_CONTROLLER;
    public static SpeedController ARM_LEFT_SPEED_CONTROLLER;
    public static SpeedController ELEVATOR_RIGHT_SPEED_CONTROLLER;
    public static SpeedController ELEVATOR_LEFT_SPEED_CONTROLLER;
    
    public static void init(){
        
        FRONT_LEFT_SPEED_CONTROLLER = new Victor(0);
        BACK_LEFT_SPEED_CONTROLLER = new Victor(1);
        FRONT_RIGHT_SPEED_CONTROLLER = new Victor(2);
        BACK_RIGHT_SPEED_CONTROLLER = new Victor(3);
        ARM_LEFT_SPEED_CONTROLLER = new Victor(4);
        ARM_RIGHT_SPEED_CONTROLLER = new Victor(5);
        ELEVATOR_RIGHT_SPEED_CONTROLLER = new Victor(6);
        ELEVATOR_LEFT_SPEED_CONTROLLER = new Victor(7);
        
        drive = new RobotDrive(0, 1, 2, 3); 
        
    }
    
}
