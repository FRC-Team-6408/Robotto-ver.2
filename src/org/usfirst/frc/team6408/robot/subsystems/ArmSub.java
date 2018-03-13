package org.usfirst.frc.team6408.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ArmSub extends Subsystem {
	public SpeedController leftArmController = new Spark(6);
	public SpeedController rightArmController = new Spark(7);
	
    public void initDefaultCommand() { }
    
    //speedValue from -1 to 1
    public void setArmSpeed(double speedValue) {
    	leftArmController.set(-speedValue);
    	rightArmController.set(speedValue);
    }
}

