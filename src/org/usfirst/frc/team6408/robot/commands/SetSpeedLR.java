package org.usfirst.frc.team6408.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6408.robot.Robot;

public class SetSpeedLR extends Command {
	
    private double m_leftSpeed;
    private double m_rightSpeed;
    
    public SetSpeedLR(double leftSpeed, double rightSpeed) {
        m_leftSpeed = leftSpeed;
        m_rightSpeed = rightSpeed;
    }
    
	protected void initialize() { }

    protected void execute() {
    	Robot.driveSub.setSpeedLR(m_leftSpeed, m_rightSpeed);
    }

    protected boolean isFinished() {
        return true;
    }

	protected void end() { }
	protected void interrupted() { }
}
