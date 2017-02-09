package org.usfirst.frc.team5905.robot.commands;

import org.usfirst.frc.team5905.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RotateTurret extends Command {

    public RotateTurret() {
    	requires(Robot.turret);
    }

    protected void initialize() {
    	Robot.turret.stopTurret();
    }

    protected void execute() {
    	Robot.turret.rotateTurret();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.turret.stopTurret();
    }

    protected void interrupted() {
    }
}
