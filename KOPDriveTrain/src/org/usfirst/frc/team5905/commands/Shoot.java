package org.usfirst.frc.team5905.commands;

import org.usfirst.frc.team5905.*;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {

    public Shoot() {
        requires(Robot.oldShooter);
    }
    
    protected void initialize() {
        Robot.oldShooter.stopShooter();
    }
    
    protected void execute() {
        Robot.oldShooter.shoot();
    }
    
    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
        Robot.oldShooter.stopShooter();
    }
    
    protected void interrupted() {
    }
    
}
