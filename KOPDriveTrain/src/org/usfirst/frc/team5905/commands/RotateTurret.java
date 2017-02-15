package org.usfirst.frc.team5905.commands;

import org.usfirst.frc.team5905.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RotateTurret extends Command {

    public RotateTurret() {
    	requires(Robot.oldTurret);
    }

    protected void initialize() {
    	Robot.oldTurret.stopTurret();
    }

    protected void execute() {
    	Robot.oldTurret.rotateTurret();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.oldTurret.stopTurret();
    }

    protected void interrupted() {
    }
}
