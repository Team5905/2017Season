package org.usfirst.frc.team5905.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team5905.commands.*;

public class OI {
	
	public Joystick gamepad;
	public JoystickButton reverseButton;
	public JoystickButton speedToggleButton;
	public JoystickButton intakeToggleButton;
	public JoystickButton climbButton;
	public JoystickButton fastClimbButton;
	public JoystickButton gearReceiveReverseButton;
	public final int reverseButtonRef = RobotMap.A_BUTTON; //buttons 
	public final int climbButtonRef = RobotMap.L_BUTTON; //buttons 
	public final int fastClimbButtonRef = RobotMap.B_BUTTON;
	public final int gearReceiveReverseButtonRef = RobotMap.Y_BUTTON;
	public final int intakeButtonRef = RobotMap.L_TRIGGER; //axes 
	public final int shootButtonRef = RobotMap.R_TRIGGER; //axes 
	public final int speedToggleButtonRef = RobotMap.R_BUTTON;
	public final int intakeToggleButtonRef = RobotMap.X_BUTTON;
	
	public OI(){
		gamepad = new Joystick(0);
		reverseButton = new JoystickButton(gamepad, reverseButtonRef);
		reverseButton.whenPressed(new Reverse());
		climbButton = new JoystickButton(gamepad, climbButtonRef);
		climbButton.whileHeld(new Climb());
		fastClimbButton = new JoystickButton(gamepad, fastClimbButtonRef);
		fastClimbButton.whileHeld(new FastClimb());
		gearReceiveReverseButton = new JoystickButton(gamepad, gearReceiveReverseButtonRef);
		gearReceiveReverseButton.whenPressed(new GearReceiveReverse());
		speedToggleButton = new JoystickButton(gamepad, speedToggleButtonRef);
		speedToggleButton.whenPressed(new DrivePowerChange());
		//intakeToggleButton.whenPressed(new )
	
	}
	
}