package org.usfirst.frc.team5905.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team5905.robot.commands.*;

public class OI {
    
    public Joystick gamepad = new Joystick(1);
    public Joystick shooterStick = new Joystick(1);
    public JoystickButton reverseButton = new JoystickButton(gamepad, 0);
    public JoystickButton intakeButton = new JoystickButton(gamepad, 1);
    public JoystickButton elevatorButton = new JoystickButton(gamepad, 2);
    
    public OI(){
        reverseButton.toggleWhenPressed(new Reverse());
        intakeButton.toggleWhenPressed(new SpinInward());
        elevatorButton.toggleWhenPressed(new Feed());
        
    }
}

