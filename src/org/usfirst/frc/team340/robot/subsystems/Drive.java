package org.usfirst.frc.team340.robot.subsystems;

import org.usfirst.frc.team340.robot.RobotMap;
import org.usfirst.frc.team340.robot.commands.DriveXbox;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Subsystem that controls the drive train
 */
public class Drive extends Subsystem {
    private static Talon leftDrive = new Talon(RobotMap.LEFT_DRIVE_PORT);
    private static Talon rightDrive = new Talon(RobotMap.RIGHT_DRIVE_PORT);
    
    /**
     * Set the default command
     */
    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new DriveXbox());
    }
    
    /**
     * Set the left drive speed
     * @param speed percentage of full
     * speed to go at [-1 ~ 1]
     */
    public void setLeftDrive(double speed) {
    	if(speed < -1) {
    		speed = -1;
    	} else if(speed > 1) {
    		speed = 1;
    	}
	
    	leftDrive.set(speed);
    }
    
    /**
     * Set the right drive speed; accounts
     * for negation
     * @param speed percentage of full
     * speed to go at [-1 ~ 1]
     */
    public void setRightDrive(double speed) {
    	if(speed < -1) {
    		speed = -1;
    	} else if(speed > 1) {
    		speed = 1;
    	}
	
    	rightDrive.set(-speed);
    }
    
    /**
     * Set both drive rails to the same
     * speed
     * @param speed the speed to set both
     * rails to
     */
    public void setBothDrive(double speed) {
    	setBothDrive(speed, speed);
    }
    
    /**
     * Set each drive rail's speed
     * separately
     * @param lSpeed left speed
     * @param rSpeed right speed
     */
    public void setBothDrive(double lSpeed, double rSpeed) {
    	setLeftDrive(lSpeed);
    	setRightDrive(rSpeed);
    }
}