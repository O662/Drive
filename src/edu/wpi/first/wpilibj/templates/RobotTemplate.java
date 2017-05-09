/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class RobotTemplate extends IterativeRobot {
    private RobotDrive Drive;
    private SpeedController m_Left;
    private SpeedController m_Right;  
    private Joystick LeftStick;
    private Joystick RightStick;

    public void robotInit() {
        RobotDriveInit();
        TalonInit();
        JoystickInit();
                

    }
    
    public void JoystickInit()
    {
        LeftStick = new Joystick(1);
        RightStick = new Joystick(2);
    }
    
    public void RobotDriveInit()
    {
        Drive = new RobotDrive(m_Left, m_Right);
    }
    
    public void TalonInit()
    {
        m_Left = new Talon(1);
        m_Right = new Talon(2);
    }
    
    public void autonomousPeriodic() {

    }

  
    public void teleopPeriodic() {
        Drive.arcadeDrive()
        
    }

    public void testPeriodic() {
    
    }
    
}