package org.usfirst.frc.team340.robot.commands.gears.manual;

import org.usfirst.frc.team340.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ManualSpinStop extends Command {

    public ManualSpinStop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.claw);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	System.out.println("initialize ManualSpinStop");
    	Robot.claw.spinStop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.claw.isStopped();
    }

    // Called once after isFinished returns true
    protected void end() {
//    	System.out.println("end ManualSpinStop");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
