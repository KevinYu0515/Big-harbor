/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.chassis;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants;
import frc.robot.motor.MotorFactory;
import frc.robot.subsystems.shooter.Spinable;

public class ControlDrivetrain extends Spinable {
  /**
   * Creates a new ControlDrivetrain.
   */
  protected static WPI_TalonFX leftMas  = new WPI_TalonFX(Constants.chassis.leftMaster);
  protected static WPI_TalonFX leftFol  = new WPI_TalonFX(Constants.chassis.leftFollewer);
  protected static WPI_TalonFX rightMas = new WPI_TalonFX(Constants.chassis.rightMaster);
  protected static WPI_TalonFX rightFol = new WPI_TalonFX(Constants.chassis.rightFollower);
  
  public ControlDrivetrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void forward() {

  }

  @Override
  public void stop() {

  }

  @Override
  public void reverse() {

  }

  @Override
  public String getStatus() {
    return null;
  }
}
