package org.usfirst.frc.team5905.robot.subsystems;

import org.usfirst.frc.team5905.robot.Robot;
import org.usfirst.frc.team5905.robot.RobotMap;
import org.usfirst.frc.team5905.robot.commands.RotateTurret;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Turret extends Subsystem {

    public void initDefaultCommand() {
    	setDefaultCommand(new RotateTurret());
    }
    
    public void rotateTurret(){
        double power = Robot.oi.shooterStick.getTwist();
    	RobotMap.TURRET_CONTROLLER.set(power);
    }
    
    public void stopTurret(){
    	RobotMap.TURRET_CONTROLLER.stopMotor();
    }
    
}

