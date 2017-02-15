package org.usfirst.frc.team5905.subsystems;

import org.usfirst.frc.team5905.Robot;
import org.usfirst.frc.team5905.RobotMap;
import org.usfirst.frc.team5905.commands.RotateTurret;

import edu.wpi.first.wpilibj.command.Subsystem;

public class TurretOld extends Subsystem {

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

