package org.usfirst.frc.team6408.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSub extends Subsystem {
	public RobotDrive drive = new RobotDrive(0, 1, 2, 3);
	public double speedMod = 1.0;  //multiplied by drive speed.
    
	public void initDefaultCommand() { }
	
    //sets the left right speed of the motors from -1 to 1.
    public void setSpeedLR (double leftSpeed, double rightSpeed) {
    	drive.setLeftRightMotorOutputs(leftSpeed * speedMod, rightSpeed * speedMod);
    }
}

