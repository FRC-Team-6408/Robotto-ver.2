package org.usfirst.frc.team6408.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class WinchSub extends Subsystem {

	public SpeedController leftWinchController = new Spark(4);
	public SpeedController rightWinchController = new Spark(5);
	
    public void initDefaultCommand() { }
    
    //speedValue from -1 to 1
    public void turnWinch(double speedValue) {
    	leftWinchController.set(speedValue * 100);
    	rightWinchController.set(speedValue * 100);
    }
}

