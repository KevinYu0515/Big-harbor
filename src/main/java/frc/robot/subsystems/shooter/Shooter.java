/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.shooter;

import com.ctre.phoenix.motorcontrol.*;
import frc.robot.motor.MotorFactory;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import frc.robot.Constants;
import frc.robot.Constants.PowCon;


public class Shooter extends Spinable {
  private SupplyCurrentLimitConfiguration supplyCurrentLimitConfiguration = new SupplyCurrentLimitConfiguration(true, 40, 50, 1);
  private TalonFX flywheelLeft = new TalonFX(17);
  private TalonFX flywheelRight = new TalonFX(15);
  

  
  public Shooter() {
    MotorFactory.setSensor(flywheelLeft,FeedbackDevice.IntegratedSensor);
    MotorFactory.setSensor(flywheelRight, FeedbackDevice.IntegratedSensor);
    
    //adjust kP,kF
    MotorFactory.configPF(flywheelLeft,PowCon.flywheel_kP,PowCon.flywheel_kF,0);
    MotorFactory.configPF(flywheelRight, PowCon.flywheel_kP, PowCon.flywheel_kF, 0);
    
    flywheelLeft.configMotionCruiseVelocity(15000, Constants.kTimeoutMs);
		flywheelLeft.configMotionAcceleration(6000, Constants.kTimeoutMs);
		flywheelLeft.setSelectedSensorPosition(0, 0, Constants.kTimeoutMs);
    
    flywheelRight.configMotionCruiseVelocity(15000, Constants.kTimeoutMs);
		flywheelRight.configMotionAcceleration(6000, Constants.kTimeoutMs);
		flywheelRight.setSelectedSensorPosition(0, 0, Constants.kTimeoutMs);



    //PeakOutput , CurrentLimit , NeutralDeadband 
    flywheelLeft.configPeakOutputForward(0.7, Constants.kTimeoutMs);
    flywheelRight.configPeakOutputForward(0.7, Constants.kTimeoutMs);
    flywheelLeft.configSupplyCurrentLimit(supplyCurrentLimitConfiguration);
    flywheelRight.configSupplyCurrentLimit(supplyCurrentLimitConfiguration);
    flywheelLeft.configNeutralDeadband(0.005, Constants.kTimeoutMs);
    flywheelLeft.configNeutralDeadband(0.005, Constants.kTimeoutMs);
    flywheelLeft.configClosedloopRamp(0.5, 10);
    flywheelRight.configClosedloopRamp(0.5, 10);
    
    flywheelRight.follow(flywheelLeft);
    flywheelLeft.setInverted(false);
    flywheelRight.setInverted(InvertType.OpposeMaster);
    
    /* Factory default hardware to prevent unexpected behavior */
    flywheelLeft.configFactoryDefault();
    flywheelRight.configFactoryDefault();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  public double getflywheelVelocity(){ 
    
    return flywheelLeft.getSelectedSensorVelocity();
  }

  @Override
  public void forward() {
    double vel = Constants.PowCon.flywheelvel;
    flywheelLeft.set(ControlMode.Velocity,vel);

  }

  @Override
  public void stop() {
    flywheelLeft.set(ControlMode.Velocity,0);

  }

  @Override
  public void reverse() {

  }

  @Override
  public String getStatus() {
    return null;
  }
}
