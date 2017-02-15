package org.usfirst.frc.team5905.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5905.commands.Shoot;
import org.usfirst.frc.team5905.Robot;
import org.usfirst.frc.team5905.RobotMap;
 
public class ShooterOld extends Subsystem {

    public void initDefaultCommand() {
    	setDefaultCommand(new Shoot());
    }
    
    public void shoot(){
        double power = Robot.oi.shooterStick.getY();
        RobotMap.SHOOTER_CONTROLLER.set(power);
    }
    
    public void stopShooter(){
        RobotMap.SHOOTER_CONTROLLER.stopMotor();
    }
    
}

