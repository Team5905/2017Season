package org.usfirst.frc.team5905.subsystems;

import org.usfirst.frc.team5905.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

    public void initDefaultCommand() {
        //no default so when not toggled, SpinInward doesn't run
    	
    }
    
    public void spin() {
		RobotMap.INTAKE_CONTROLLER.set(RobotMap.INTAKE_SPEED);
	}
	
	public void stopSpin() {
		RobotMap.INTAKE_CONTROLLER.stopMotor();
	}
}

