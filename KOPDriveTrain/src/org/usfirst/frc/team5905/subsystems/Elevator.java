package org.usfirst.frc.team5905.robot.subsystems;

import org.usfirst.frc.team5905.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {
    
    public void initDefaultCommand() {
        // no default so spins only with toggle
    }
    
    public void spin() {
		RobotMap.ELEVATOR_CONTROLLER.set(RobotMap.ELEVATOR_SPEED);
	}
	
	public void stopSpin() {
		RobotMap.ELEVATOR_CONTROLLER.stopMotor();
	}
}

