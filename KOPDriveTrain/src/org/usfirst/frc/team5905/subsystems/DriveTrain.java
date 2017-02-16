package org.usfirst.frc.team5905.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5905.Robot;
import org.usfirst.frc.team5905.RobotMap;
import org.usfirst.frc.team5905.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

public class DriveTrain extends Subsystem {
	
	private enum DriveTrainMode {
		MANUAL, DRIVE_STRAIGHT, ROTATE, DRIVE_BACKWARDS
	}
	private final RobotDrive myDrive = RobotMap.drive;
	DriveTrainMode mode;

    public void initDefaultCommand() {
    	setDefaultCommand(new MoveWithJoysticks());
    }
    
    public void prepareManual(){
    	mode = DriveTrainMode.MANUAL;
    }
    
    public void moveWithJoysticks(){
    	double leftPower = RobotMap.DRIVE_SPEED * Robot.oi.gamepad.getRawAxis(RobotMap.LEFT_GAMEPAD_JOYSTICK_Y);
		double rightPower = RobotMap.DRIVE_SPEED * Robot.oi.gamepad.getRawAxis(RobotMap.RIGHT_GAMEPAD_JOYSTICK_Y);
		myDrive.tankDrive(leftPower,  rightPower);
    }
    
    public void reverse(){
    	myDrive.setInvertedMotor(MotorType.kFrontLeft, true);
    }
}

