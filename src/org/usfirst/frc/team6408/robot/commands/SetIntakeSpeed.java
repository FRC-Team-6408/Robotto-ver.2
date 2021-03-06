package org.usfirst.frc.team6408.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6408.robot.Robot;

public class SetIntakeSpeed extends Command {
    private int m_direction;
    private double m_speed;
    
    public SetIntakeSpeed(int direction) {
        m_direction = direction;
        m_speed = 0;
    }
    
    public SetIntakeSpeed(int direction, double speed) {
        m_direction = direction;
        m_speed = speed;
    }

    protected void initialize() { }
    
    
    protected void execute() {
    	Robot.clawSub.setClawIntakeSpeed(m_direction * m_speed);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() { }
    protected void interrupted() { }
}
