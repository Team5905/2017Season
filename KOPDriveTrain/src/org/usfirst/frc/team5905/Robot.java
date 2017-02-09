
package org.usfirst.frc.team5905.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import org.usfirst.frc.team5905.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

public class Robot extends IterativeRobot {

	Command autonomousCommand;
	public static OI oi;
    public static DriveTrain driveTrain;
    public static Intake intake;
    public static Elevator elevator;
    public static Shooter shooter;
    public static Turret turret;
    
    

    public void robotInit() {
    	RobotMap.init();
		oi = new OI();
		driveTrain = new DriveTrain();
		intake = new Intake();
		elevator = new Elevator();
		shooter = new Shooter();
		turret = new Turret();
    }
	
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
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
