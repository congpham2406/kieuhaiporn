/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;

public class Drivebase extends SubsystemBase {
public WPI_TalonSRX rightEncoded = new WPI_TalonSRX(02);
public WPI_TalonSRX leftEncoded = new WPI_TalonSRX(01);
public WPI_TalonSRX rightFollow = new WPI_TalonSRX(03);
public WPI_TalonSRX leftFollow = new WPI_TalonSRX(04);
  public Drivebase() {
    leftFollow.follow(leftEncoded);
    rightFollow.follow(rightEncoded);
    rightEncoded.setInverted(true);

    
  }
  public void drive(double x,double y) {
    leftEncoded.set(x);
    rightEncoded.set(y);
    
    // lmao yeet
  }
  @Override
  public void periodic() {
    drive(RobotContainer.stick.getRawAxis(1) * 0.8, RobotContainer.stick.getRawAxis(5) * 0.8);
    
  }
}


