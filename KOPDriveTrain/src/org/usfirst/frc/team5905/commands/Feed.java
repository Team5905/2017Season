package org.usfirst.frc.team5905.robot.commands;

import org.usfirst.frc.team5905.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Feed extends Command {

    public Feed() {
    	requires(Robot.elevator);
    }

    protected void initialize() {
    	Robot.elevator.stopSpin();
    }

    protected void execute() {
    	Robot.elevator.spin();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
<<<<<<< HEAD
    	Robot.elevator.stopSpin();
=======
        Robot.elevator.stopSpin();
>>>>>>> Patrick's-Tests
    }

    protected void interrupted() {
    }
}