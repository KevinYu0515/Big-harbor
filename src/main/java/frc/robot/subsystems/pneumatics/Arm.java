package frc.robot.subsystems.pneumatics;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Arm extends SubsystemBase{
    protected DoubleSolenoid m_DoubleSolenoid = new DoubleSolenoid(0,1);

    public Arm(){
    }
    
    public void Arm_on(){
        m_DoubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void Arm_off(){
        m_DoubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

}