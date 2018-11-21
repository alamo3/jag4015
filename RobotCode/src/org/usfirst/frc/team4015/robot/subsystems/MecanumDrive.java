package org.usfirst.frc.team4015.robot.subsystems;
import edu.wpi.first.wpilibj.*;
public class MecanumDrive extends TimedRobot {
	RobotDrive myDrive;
	
	public void teleopPeriodic() {
		myDrive.mecanumDrive_Cartesian(joystickControl.RightJoystick.getX(), joystickControl.RightJoystick.getY(), joystickControl.RightJoystick.getZ());
	}
}
