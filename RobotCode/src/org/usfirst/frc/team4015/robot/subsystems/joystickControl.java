package org.usfirst.frc.team4015.robot.subsystems;

import org.usfirst.frc.team4015.robot.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;


public class joystickControl extends Subsystem {

	Joystick LeftJoystick = new Joystick(RobotMap.leftStickPort);
	Joystick RightJoystick = new Joystick(RobotMap.rightStickPort);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
// lets say I make this change for testing purposes
	}

}
