package org.usfirst.frc.team6408.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6408.robot.Robot;

public class MoveArm extends Command {
    private int m_direction;
    private double m_speed;
    
    public MoveArm(int direction) {
        m_direction = direction;
        m_speed = 0;
    }
    
    public MoveArm(int direction, double speed) {
        m_direction = direction;
        m_speed = speed;
    }

    protected void initialize() { }

    protected void execute() {
    	Robot.armSub.setArmSpeed(m_direction * m_speed);
    }

    protected boolean isFinished() {
        return true;
    }
    
    protected void end() { }
    protected void interrupted() { }
}
