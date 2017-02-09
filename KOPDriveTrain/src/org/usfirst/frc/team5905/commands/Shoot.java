package org.usfirst.frc.team5905.robot.commands;

import org.usfirst.frc.team5905.robot.*;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {

    public Shoot() {
        requires(Robot.shooter);
    }
    
    protected void initialize() {
    }
    
    protected void execute() {
    }
    
    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    }
    
    protected void interrupted() {
    }
    
}
