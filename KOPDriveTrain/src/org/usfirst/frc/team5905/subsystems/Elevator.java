package org.usfirst.frc.team5905.robot.subsystems;

import org.usfirst.frc.team5905.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {

    public void initDefaultCommand() {
        // no default so spins only with toggle
    }
    
    public void spin() {
    	double speed = RobotMap.ELEVATOR_SPEED;
		RobotMap.ELEVATOR_LEFT_SPEED_CONTROLLER.set(speed);
		RobotMap.ELEVATOR_RIGHT_SPEED_CONTROLLER.set(-1 * speed);
	}
	
	public void stopSpin() {
		RobotMap.ELEVATOR_LEFT_SPEED_CONTROLLER.stopMotor();
		RobotMap.ELEVATOR_RIGHT_SPEED_CONTROLLER.stopMotor();
	}
}

