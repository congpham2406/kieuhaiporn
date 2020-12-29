/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;

public class Pusher extends SubsystemBase {
  public WPI_TalonSRX pusher1 = new WPI_TalonSRX(02); 
  public WPI_TalonSRX pusher2 = new WPI_TalonSRX(01);
  public VictorSPX grip = new WPI_VictorSPX(03);
  //Correct this
public static void Climb() {
  double x = /*FPGAcaclonditme*/ ;
  while (/*FPGAcaclonditme*/-x<) {
    pusher1.set(0.4);
    pusher2.set(0.4);
  }
  pusher1.set(0);
  pusher2.set(0);
  double y = /*FPGAcaclonditme*/;
  while (/*FPGAcaclonditme*/-y<) {
    grip.set(ControlMode.PercentOutput, 0.4);
}
grip.set(ControlMode.PercentOutput, 0);
}

// Cách này bị busy waiting
@Override
  public void periodic() {
    if (RobotContainer.stick.getRawButton(5) == true) { //Correct this as well
      Pusher.Climb();
    }
  }
}

//Sai nhiều vãi lồn do tao quên cái FPGA time j j đấy dùng ntn có gì thay vào hộ tao ở chỗ FPGAcaclonditme í