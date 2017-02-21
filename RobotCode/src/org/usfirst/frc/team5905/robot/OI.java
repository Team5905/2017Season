package org.usfirst.frc.team5905.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team5905.commands.*;

public class OI {
	
	public Joystick gamepad;
    //public Joystick shooterStick;
	//public JoystickButton reverseButton;
	//public JoystickButton intakeButton;
	//public JoystickButton elevatorButton;
	
	public OI(){
		 gamepad = new Joystick(0);
		 //shooterStick = new Joystick (1);
		 
		 //test code
		 
		 
		 
		 
		 //end test code
		 
		 
		 
		 
		 
		 //reverseButton = new JoystickButton(gamepad, 0);
		// intakeButton = new JoystickButton(gamepad, 6);
		// elevatorButton = new JoystickButton(gamepad, 2);
		//intakeButton.whileHeld(new SpinInward());
		//reverseButton.toggleWhenPressed(new Reverse());
		//elevatorButton.toggleWhenPressed(new Feed());
		
	}
	public Joystick getGamepad() {
        return gamepad;
    }
}