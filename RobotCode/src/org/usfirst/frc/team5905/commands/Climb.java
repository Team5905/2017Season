package org.usfirst.frc.team5905.commands;

import org.usfirst.frc.team5905.robot.Robot;
import org.usfirst.frc.team5905.robot.RobotMap;
import org.usfirst.frc.team5905.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command {
	boolean check = false;
    public Climb() {
    	requires(Robot.climber);
    }

    protected void initialize() {
    	
    }

    protected void execute() {
    	check = false;
    	if(Robot.oi.gamepad.getRawButton(RobotMap.L_BUTTON))
    		Robot.climber.Climb();
    	else
    		check = true;
    }

    protected boolean isFinished() {
        return check;
    }

    protected void end() {
    	Robot.climber.stopClimb();
    }

    protected void interrupted() {
    }
}