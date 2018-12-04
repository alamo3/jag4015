package org.usfirst.frc.team4015.robot.subsystems;
import utilityObjects.*;
import org.usfirst.frc.team4015.robot.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;


public class joystickControl extends Subsystem {

	static Joystick LeftJoystick = new Joystick(RobotMap.leftStickPort);
	static Joystick RightJoystick = new Joystick(RobotMap.rightStickPort);
	
	public static final double JOY_DEADZONE = 0.05;
	

	
	public double getLeftJoyX() {
		double joystickX = LeftJoystick.getX();
		return Math.abs(joystickX) < JOY_DEADZONE ? 0.0 : joystickX;
	}

	public double getLeftJoyY() {
		double joystickY = LeftJoystick.getY();
		return Math.abs(joystickY) < JOY_DEADZONE ? 0.0 : joystickY;
	}
	
	public double getLeftJoyZ() {
		double joystickZ = LeftJoystick.getZ();
		return Math.abs(joystickZ) < JOY_DEADZONE ? 0.0 : joystickZ;
	}
	
	// ---------------------- CURRENTLY OBESELETE BECAUSE WE NEEDED DEADZONES
	// maybe use this maybe ditch it or just leave it for the twist and throttle ease of access 
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
