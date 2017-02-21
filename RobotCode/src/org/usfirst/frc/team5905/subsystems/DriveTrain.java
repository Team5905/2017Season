package org.usfirst.frc.team5905.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5905.robot.Robot;
import org.usfirst.frc.team5905.robot.RobotMap;
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
    	double leftPower = RobotMap.STRAIGHT * RobotMap.DRIVE_SPEED * Robot.oi.gamepad.getRawAxis(RobotMap.LEFT_GAMEPAD_JOYSTICK_Y);
    	//leftPower = 0;
		double rightPower = RobotMap.STRAIGHT * RobotMap.DRIVE_SPEED * Robot.oi.gamepad.getRawAxis(RobotMap.RIGHT_GAMEPAD_JOYSTICK_Y);
		//rightPower = 0;
		myDrive.tankDrive(leftPower,  rightPower);
    }
    
    public void reverse(){
    	myDrive.setInvertedMotor(MotorType.kFrontLeft, true);
    }
    
    public void AutoRightSpin(){
    	double leftPower = RobotMap.DRIVE_SPEED; //switch values to negative depending on spin direction
    	double rightPower = -1 * RobotMap.DRIVE_SPEED;
    	myDrive.tankDrive(leftPower, rightPower);
    }
    
    public void AutoLeftSpin(){
    	double leftPower = -1 * RobotMap.DRIVE_SPEED; //switch values to negative depending on spin direction
    	double rightPower = RobotMap.DRIVE_SPEED;
    	myDrive.tankDrive(leftPower, rightPower);
    }
    
    public void AutoDriveStraight(double leftIncrease, double rightIncrease){
    	double leftPower = RobotMap.DRIVE_SPEED + leftIncrease;
    	double rightPower = RobotMap.DRIVE_SPEED + rightIncrease;
    	myDrive.tankDrive(leftPower, rightPower);
    }
    public void AutoBrake(double direction) {
    	myDrive.tankDrive(direction * 0.1, direction * 0.1);
    }
}
