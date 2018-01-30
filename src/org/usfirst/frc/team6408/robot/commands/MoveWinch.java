package org.usfirst.frc.team6408.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6408.robot.Robot;

public class MoveWinch extends Command {
    private int m_direction;
    private double m_speed;
    
    public MoveWinch(int direction) {
        m_direction = direction;
        m_speed = 0;
    }
    
    public MoveWinch(int direction, double speed) {
        m_direction = direction;
        m_speed = speed;
    }

	protected void initialize() { }
	
    protected void execute() {
    	Robot.winchSub.turnWinch(m_direction * m_speed);  //direction can make speed negitave.
    }

    protected boolean isFinished() {
        return true;
    }
    
	protected void end() { }
	protected void interrupted() { }
}
