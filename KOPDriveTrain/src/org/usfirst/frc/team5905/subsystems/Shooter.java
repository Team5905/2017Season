package org.usfirst.frc.team5905.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5905.robot.commands.Shoot;
 
public class Shooter extends Subsystem {

    public void initDefaultCommand() {
    	setDefaultCommand(new Shoot());
    }
}

