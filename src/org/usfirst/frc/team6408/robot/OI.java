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
       
    	//arm buttons
    	armUpButton = new JoystickButton(ps4Controller, 5);
    	armUpButton.whileHeld(new MoveArm(DIRECTION_UP, 0.8));
    	armUpButton.whenReleased(new MoveArm(DIRECTION_STOPPED, 0));
    	armDownButton = new JoystickButton(ps4Controller, 7);
    	armUpButton.whileHeld(new MoveArm(DIRECTION_DOWN, 0.6));  //slower than armUp because gravity.
    	armUpButton.whenReleased(new MoveArm(DIRECTION_STOPPED));
    	
    	//winch buttons
    	winchUpMainButton = new JoystickButton(ps4Controller, 14);
    	winchUpMainButton.whileHeld(new MoveWinch(DIRECTION_UP, 0.95));  //winch goes at near full speed.
    	winchUpMainButton.whenReleased(new MoveWinch(DIRECTION_STOPPED));
    	winchUpButton = new JoystickButton(ps4Controller, 16);  //just a guess
    	winchUpButton.whileHeld(new MoveWinch(DIRECTION_UP, 0.95));  //winch goes at near full speed.
    	winchUpButton.whenReleased(new MoveWinch(DIRECTION_STOPPED)); 
    	winchDownButton = new JoystickButton(ps4Controller, 20);  //just a guess
    	winchDownButton.whileHeld(new MoveWinch(DIRECTION_DOWN, 0.3));  //winch goes down slowly
    	winchDownButton.whenReleased(new MoveWinch(DIRECTION_STOPPED)); 
    
    	//claw buttons
    	clawInButton = new JoystickButton(ps4Controller, 1);
    	clawInButton.whileHeld(new SetIntakeSpeed(DIRECTION_IN, 0.7));  //just a high-ish speed.
    	clawInButton.whenReleased(new SetIntakeSpeed(DIRECTION_IN, 0.05));  //a small amount of pressure.
    	clawOutButton = new JoystickButton(ps4Controller, 3);
    	clawOutButton.whileHeld(new SetIntakeSpeed(DIRECTION_OUT, 1));  //full speed.  So it shoots the box.  //TODO: make sure we dont kill anyone.
    	clawOutButton.whenReleased(new SetIntakeSpeed(DIRECTION_STOPPED));  //a small amount of pressure.
    	
    	//speed buttons
        slowSpeedButton = new JoystickButton(ps4Controller, 9);
        slowSpeedButton.whenPressed(new SetDriveSpeedMod(0.35));
        fastSpeedButton = new JoystickButton(ps4Controller, 10);
        fastSpeedButton.whenPressed(new SetDriveSpeedMod(0.7));
    }
}

