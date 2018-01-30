package org.usfirst.frc.team6408.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6408.robot.Robot;

public class SetDriveSpeedMod extends Command {
    private double m_speedMod;
    
    public SetDriveSpeedMod(double speedMod) {
    	m_speedMod = speedMod;
    }

    protected void initialize() { }
    
    protected void execute() {
    	Robot.driveSub.speedMod = m_speedMod;
	}

    protected boolean isFinished() {
        return true;  //this is an instant command.
    }

	protected void end() { }
	protected void interrupted() { }
}
