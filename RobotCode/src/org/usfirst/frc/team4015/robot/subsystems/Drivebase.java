	package org.usfirst.frc.team4015.robot.subsystems;

import org.usfirst.frc.team4015.robot.RobotMap;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivebase extends Subsystem {
	public Talon LeftFrontMotor;
	public Talon LeftBackMotor;
	public Talon RightFrontMotor;
	public Talon RightBackMotor;
	
	public Drivebase() {
		LeftFrontMotor = new Talon(RobotMap.frontLeftMotor);
		LeftBackMotor = new Talon(RobotMap.backLeftMotor);
		RightFrontMotor = new Talon(RobotMap.frontRightMotor);
		RightBackMotor = new Talon(RobotMap.backRightMotor);
		
		
	}
	@Override
	protected void initDefaultCommand() {
		
	}

}
