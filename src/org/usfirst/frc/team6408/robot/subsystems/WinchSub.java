package org.usfirst.frc.team6408.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

//Deprecated class
public class WinchSub extends Subsystem {

	//the speed controller for the single winch motor
	public SpeedController winchController = new Spark(8);
	
    public void initDefaultCommand() { }
    
    //speedValue from -1 to 1
    public void turnWinch(double speedValue) {
    	//winchController.set(speedValue);
    }
}

