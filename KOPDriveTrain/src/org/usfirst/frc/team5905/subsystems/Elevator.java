package org.usfirst.frc.team5905.subsystems;

import org.usfirst.frc.team5905.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {
    
    public void initDefaultCommand() {
        setDefaultCommand(new Feed());
    }
    
    public void spin() {
		RobotMap.ELEVATOR_CONTROLLER.set(RobotMap.ELEVATOR_SPEED);
	}
	
	public void stopSpin() {
		RobotMap.ELEVATOR_CONTROLLER.stopMotor();
	}
}

