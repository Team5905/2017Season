package org.usfirst.frc.team5905.robot.commands;

import org.usfirst.frc.team5905.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Reverse extends Command {
    
    public Reverse() {
        requires(Robot.driveTrain);
    }
    
    protected void initialize() {
        Robot.driveTrain.reverse();
        
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
