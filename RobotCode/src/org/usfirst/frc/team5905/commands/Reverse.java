package org.usfirst.frc.team5905.commands;

import org.usfirst.frc.team5905.robot.Robot;
import org.usfirst.frc.team5905.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Reverse extends Command {

    public Reverse() {
    	requires(Robot.driveTrain);
    }

    protected void initialize() {
    	Robot.driveTrain.reverse();
    }

    protected void execute() {
    	if(Robot.oi.gamepad.getRawButton(3)) {
    		RobotMap.STRAIGHT = -1 * RobotMap.STRAIGHT;
    	}
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
