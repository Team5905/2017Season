package org.usfirst.frc.team5905.commands;

import org.usfirst.frc.team5905.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;


public class SpinInward extends Command {

    private boolean toggle = false;
    
    public SpinInward() {
    	requires(Robot.intake);
    }

    protected void initialize() {
    	Robot.intake.stopSpin();
    }

    protected void execute() {
        if (Robot.oi.gamepad.getRawButton(Robot.oi.intakeButton)){
            toggle = !toggle;
            Timer.delay(.25);
        }
        if (toggle)
            Robot.intake.spin();
        else
            Robot.intake.stopSpin();
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
