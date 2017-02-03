
package org.usfirst.frc.team5905.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import org.usfirst.frc.team5905.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

public class Robot extends IterativeRobot {

	public static OI oi;

    Command autonomousCommand;
    SendableChooser chooser;
    
    public static DriveTrain driveTrain;
    public static Intake intake;
    public static Elevator elevator;

    public void robotInit() {
		oi = new OI();
		intake = new Intake();
		elevator = new Elevator();
    }
	
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        autonomousCommand = (Command) chooser.getSelected();
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
