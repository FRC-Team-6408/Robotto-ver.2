
package org.usfirst.frc.team6408.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;
import org.usfirst.frc.team6408.robot.Robot;

public class SetSpeedLRForTime extends Command {

    private double m_leftSpeed;
    private double m_rightSpeed;
		private double m_timeLength;
		private Timer m_timer = new Timer();

		//Time is in seconds, speed from 1 to -1.
    public SetSpeedLRForTime(double leftSpeed, double rightSpeed, int m_timeLength) {
        m_leftSpeed = leftSpeed;
        m_rightSpeed = rightSpeed;
    }

		//init timer
	  protected void initialize() {
		  m_timer.start();
	  }

    protected void execute() {
    	Robot.driveSub.setSpeedLR(m_leftSpeed, m_rightSpeed);
    }

    protected boolean isFinished() {
			//Check if time is up and command should stop
			if (m_timer.get() > m_timeLength) {
				Robot.driveSub.setSpeedLR(0, 0);  //stop robot
				return true;  //end command
			} else {
				return false;  //continue command
			}
    }

	//stop timer
	protected void end() {
		m_timer.stop();
	}

	protected void interrupted() { }
}