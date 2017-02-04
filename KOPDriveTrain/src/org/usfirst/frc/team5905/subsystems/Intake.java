package org.usfirst.frc.team5905.robot.subsystems;

import org.usfirst.frc.team5905.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
    
    public void initDefaultCommand() {
        //no default so when not toggled, SpinInward doesn't run
        
    }
    
    public void spin() {
        double speed = RobotMap.INTAKE_SPEED;
        RobotMap.ARM_LEFT_SPEED_CONTROLLER.set(speed);
        RobotMap.ARM_RIGHT_SPEED_CONTROLLER.set(-1 * speed);
    }
    
    public void stopSpin() {
        RobotMap.ARM_LEFT_SPEED_CONTROLLER.stopMotor();
        RobotMap.ARM_RIGHT_SPEED_CONTROLLER.stopMotor();
    }
}

