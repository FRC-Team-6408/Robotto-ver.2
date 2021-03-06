package org.usfirst.frc.team6408.robot;

import org.usfirst.frc.team6408.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6408.robot.subsystems.*;

public class OI {
    //constants
    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_DOWN = -1;
    public static final int DIRECTION_IN = 1;
    public static final int DIRECTION_OUT = -1;
    public static final int DIRECTION_STOPPED = 0;

	public JoystickButton armUpButton;
	public JoystickButton armDownButton;

	public JoystickButton winchUpMainButton;
	public JoystickButton winchUpButton;
	public JoystickButton winchDownButton;

	public JoystickButton clawInButton;
	public JoystickButton clawOutButton;  //button and axis, but button i think...

	public JoystickButton slowSpeedButton;
	public JoystickButton fastSpeedButton;

    public Joystick ps4Controller;

    public OI() {
    	ps4Controller = new Joystick(0);

    	//arm buttons (I probably wont use this code)
    	// Use this if moving the arm with the joystick is badd.

    	armUpButton = new JoystickButton(ps4Controller, 4);
    	armUpButton.whileHeld(new MoveArm(DIRECTION_UP, 1));
    	armUpButton.whenReleased(new MoveArm(DIRECTION_STOPPED, 0));
    	armDownButton = new JoystickButton(ps4Controller, 2);
    	armDownButton.whileHeld(new MoveArm(DIRECTION_DOWN, 0.75));  //slower than armUp because gravity.
    	armDownButton.whenReleased(new MoveArm(DIRECTION_STOPPED, 0));

    	//claw buttons
    	clawInButton = new JoystickButton(ps4Controller, 8);
    	clawInButton.whileHeld(new SetIntakeSpeed(DIRECTION_IN, 0.7));  //just a high-ish speed.
    	clawInButton.whenReleased(new SetIntakeSpeed(DIRECTION_IN, 0.05));  //a small amount of pressure.
    	clawOutButton = new JoystickButton(ps4Controller, 6);
    	clawOutButton.whileHeld(new SetIntakeSpeed(DIRECTION_OUT, 0.6));  //full speed.  So it shoots the box.  //TODO: make sure we dont kill anyone.
    	clawOutButton.whenReleased(new SetIntakeSpeed(DIRECTION_STOPPED, 0));  //a small amount of pressure.

    	//speed buttons
        slowSpeedButton = new JoystickButton(ps4Controller, 7);
        slowSpeedButton.whenPressed(new SetDriveSpeedMod(0.5));
        fastSpeedButton = new JoystickButton(ps4Controller, 5);
        fastSpeedButton.whenPressed(new SetDriveSpeedMod(0.75));
    }
}
