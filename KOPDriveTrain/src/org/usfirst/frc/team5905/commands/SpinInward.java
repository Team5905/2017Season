package org.usfirst.frc.team5905.robot.commands;

import org.usfirst.frc.team5905.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinInward extends Command {

    public SpinInward() {
    	requires(Robot.intake);
    }

    protected void initialize() {
    	Robot.intake.stopSpin();
    }

    protected void execute() {
    	Robot.intake.spin();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.intake.stopSpin();
    }

    protected void interrupted() {
    }
}
