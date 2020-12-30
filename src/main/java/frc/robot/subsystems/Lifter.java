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

public class Lifter extends SubsystemBase {
  public WPI_TalonSRX Lifter = new WPI_TalonSRX(7);

  @Override
  public void periodic() {
    if (RobotContainer.stick.getRawButton(1)) {
      Lifter.set(1);
    }
    else if  (RobotContainer.stick.getRawButton(2)) {
      Lifter.set(-1);
    }
    else {
      Lifter.stopMotor();
    }
  }
}
