/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;

public class Grabber extends SubsystemBase {
public WPI_TalonSRX Grabber = new WPI_TalonSRX(11);

  @Override
public void periodic() {
if (RobotContainer.stick.getRawButton(3) == true) {
  Grabber.set(1);
}
if  (RobotContainer.stick.getRawButton(4) == true) {
  Grabber.set(-1);
}
  }
}