package org.usfirst.frc.team5905.commands;

import org.usfirst.frc.team5905.robot.Robot;
import org.usfirst.frc.team5905.robot.RobotMap;
import org.usfirst.frc.team5905.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public class FastClimb extends Command {
	boolean check = false;
    public FastClimb() {
    	requires(Robot.climber);
    }

    protected void initialize() {
    	
    }

    protected void execute() {
    	check = false;
    	if(Robot.oi.gamepad.getRawButton(RobotMap.B_BUTTON))
    		Robot.climber.FastClimb();
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