package org.usfirst.frc.team5905.commands;

import org.usfirst.frc.team5905.robot.*;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Command;



import org.usfirst.frc.team5905.robot.RobotMap;
public class AutonomousDrive extends Command {
	private final ADXRS450_Gyro gyro = RobotMap.driveTrainGyro;
    double timer = 0;
    int theta = 100;
    double maxtime = 0;
    
    boolean exit = false;
    
    double leftDistance;
    double rightDistance;
    int leftCount;
    int rightCount;
    double leftIncrease = 0;
    double rightIncrease = 0;

    public AutonomousDrive() {
     requires(Robot.driveTrain);
    }

    protected void initialize() {
     //maxtime = .01 * theta/RobotMap.DRIVE_SPEED;
     //timer = 0;
     RobotMap.LEFT_DRIVE_ENCODER.reset();
     RobotMap.RIGHT_DRIVE_ENCODER.reset();
     RobotMap.LEFT_DRIVE_ENCODER.setDistancePerPulse(RobotMap.DISTANCE_PER_PULSE);
     RobotMap.RIGHT_DRIVE_ENCODER.setDistancePerPulse(RobotMap.DISTANCE_PER_PULSE);
    }
    // 0.03743640427362351  for 50
    protected void execute() {

        Robot.driveTrain.AutoDriveStraight(leftIncrease, rightIncrease);
        System.out.println("Gyro Angle: " + gyro.getAngle());
        
        leftCount = RobotMap.LEFT_DRIVE_ENCODER.get();
        rightCount = RobotMap.RIGHT_DRIVE_ENCODER.get();
        System.out.println("LeftCount: " + leftCount);
        System.out.println("RightCount: " + rightCount);
        
        leftDistance = RobotMap.LEFT_DRIVE_ENCODER.getDistance();
        rightDistance = RobotMap.RIGHT_DRIVE_ENCODER.getDistance();
        System.out.println("Left Distance: " + leftDistance);
        System.out.println("Right Distance: " + rightDistance);
        
        /*if(leftDistance > rightDistance) {
        	leftIncrease -= leftDistance - ((leftDistance + rightDistance)/2)/((leftDistance + rightDistance)/2);
        }
        else if(rightDistance > leftDistance) {
        	leftIncrease += rightDistance - ((rightDistance + leftDistance)/2)/((rightDistance + leftDistance)/2);
        }*/
        
        /*if((leftDistance + rightDistance)/2 > RobotMap.STRAIGHT_DISTANCE) {
        	exit = true;
        }*/
        if(leftCount > 50) {
        	exit = true;
        }
        
    }

    protected boolean isFinished() {
    	return exit;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}