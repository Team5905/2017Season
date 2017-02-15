package org.usfirst.frc.team5905;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team5905.commands.*;

public class OI {
	
	public Joystick gamepad = new Joystick(1);
    public Joystick shooterStick = new Joystick (2);
	public JoystickButton reverseButton = new JoystickButton(gamepad, 0);
	public JoystickButton intakeButton = new JoystickButton(gamepad, 1);
	public JoystickButton elevatorButton = new JoystickButton(gamepad, 2);
	public JoystickButton increaseShooterSpeed;
    public JoystickButton decreaseShooterSpeed;
    public JoystickButton moveTurretLeft;
    public JoystickButton moveTurretRight;
	
	public OI(){
		reverseButton.toggleWhenPressed(new Reverse());
		intakeButton.toggleWhenPressed(new SpinInward());
		elevatorButton.toggleWhenPressed(new Feed());
		moveTurretRight = new JoystickButton(gamepad, 6);
	    moveTurretRight.whenPressed(new TurretMoveRight());
	    moveTurretLeft = new JoystickButton(gamepad, 5);
	    moveTurretLeft.whenPressed(new TurretMoveLeft());
	    decreaseShooterSpeed = new JoystickButton(gamepad, 4);
	    decreaseShooterSpeed.whenPressed(new ShooterDecreaseSpeed());
	    increaseShooterSpeed = new JoystickButton(gamepad, 3);
	    increaseShooterSpeed.whenPressed(new ShooterIncreaseSpeed());


	    // SmartDashboard Buttons
	    SmartDashboard.putData("ShooterStop", new ShooterStop());
	    SmartDashboard.putData("ShooterIncreaseSpeed", new ShooterIncreaseSpeed());
	    SmartDashboard.putData("ShooterDecreaseSpeed", new ShooterDecreaseSpeed());
	    SmartDashboard.putData("TurretCenter", new TurretCenter());
	    SmartDashboard.putData("TurretMoveLeft", new TurretMoveLeft());
	    SmartDashboard.putData("TurretMoveRight", new TurretMoveRight());
		
	}
}

