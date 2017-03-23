package org.usfirst.frc.team5905.commands;

import org.usfirst.frc.team5905.robot.Robot;
import org.usfirst.frc.team5905.robot.RobotMap;
import org.usfirst.frc.team5905.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public class GearReceiveReverse extends Command {

    public GearReceiveReverse() {
    	requires(Robot.driveTrain);
    }

    protected void initialize() {
    	setTimeout(0.5);
    }

    protected void execute() {
    	Robot.driveTrain.gearReceiveReverse(0.5, 0.5);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.driveTrain.gearReceiveReverse(0, 0);
    }

    protected void interrupted() {
    }
}