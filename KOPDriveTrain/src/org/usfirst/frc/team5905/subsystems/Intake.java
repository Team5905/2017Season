package org.usfirst.frc.team5905.robot.subsystems;

import org.usfirst.frc.team5905.robot.RobotMap;
import org.usfirst.frc.team5905.robot.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

    public void initDefaultCommand() {
        //no default so when not toggled, SpinInward doesn't run
    	
    }
    
    public void spin(int direction, double speed) {
		RobotMap.ARM_LEFT_SPEED_CONTROLLER.set(speed * direction);
		RobotMap.ARM_RIGHT_SPEED_CONTROLLER.set(-1 * speed * direction);
	}

	public void spinInward() {
		spin(1, RobotMap.INTAKE_SPEED);	
	}
	
	public void stopSpin() {
		spin(0, 0);
	}
}

