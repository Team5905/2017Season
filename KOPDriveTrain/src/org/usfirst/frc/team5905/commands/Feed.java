package org.usfirst.frc.team5905.commands;

import org.usfirst.frc.team5905.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

public class Feed extends Command {

    boolean toggle = false;
    public Feed() {
    	requires(Robot.elevator);
    }

    protected void initialize() {
    	Robot.elevator.stopSpin();
    }

    protected void execute() {
        if (Robot.oi.gamepad.getRawButton(Robot.oi.elevatorButton)){
            toggle = !toggle;
            Timer.delay(.25);
        }
        if (toggle)
            Robot.elevator.spin();
        else
            Robot.elevator.stopSpin();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.elevator.stopSpin();
    }

    protected void interrupted() {
    }
}