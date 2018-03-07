package org.usfirst.frc.team6408.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ClawSub extends Subsystem {
	public SpeedController clawIntakeLeftController = new Spark(4);
	public SpeedController clawIntakeRightController = new Spark(5);
	
	public void initDefaultCommand() { }
    
    //speedValue from -1 to 1
    public void setClawIntakeSpeed(double speedValue) {
    	clawIntakeLeftController.set(speedValue);
    	clawIntakeRightController.set(speedValue);
    }
    
}

