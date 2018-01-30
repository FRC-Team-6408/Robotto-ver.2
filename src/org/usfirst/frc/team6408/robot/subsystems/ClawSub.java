package org.usfirst.frc.team6408.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ClawSub extends Subsystem {
	public SpeedController clawIntakeController = new Spark(6);
	
	public void initDefaultCommand() { }
    
    //speedValue from -1 to 1
    public void setClawIntakeSpeed(double speedValue) {
    	clawIntakeController.set(speedValue * 100);
    }
    
}

