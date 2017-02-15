package org.usfirst.frc.team5905.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5905.commands.Shoot;
 
public class ShooterOld extends Subsystem {

    public void initDefaultCommand() {
    	setDefaultCommand(new Shoot());
    }
}

