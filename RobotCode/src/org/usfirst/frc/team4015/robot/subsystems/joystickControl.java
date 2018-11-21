package org.usfirst.frc.team4015.robot.subsystems;
import utilityObjects.*;
import org.usfirst.frc.team4015.robot.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;


public class joystickControl extends Subsystem {

	static Joystick LeftJoystick = new Joystick(RobotMap.leftStickPort);
	static Joystick RightJoystick = new Joystick(RobotMap.rightStickPort);
	
	public joystickInfo getLeftJoyInfo() {
		return new joystickInfo(
				LeftJoystick.getX(),
				LeftJoystick.getY(),
				LeftJoystick.getZ(),
				LeftJoystick.getTwist(),
				LeftJoystick.getThrottle()
				);
	}
	

	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}

}
