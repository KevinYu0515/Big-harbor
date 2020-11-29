package frc.robot.subsystems.pneumatics;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Compressor;

public class Phnematics extends SubsystemBase{
    protected Compressor m_Compressor = new Compressor();

    public Phnematics(){
    }
    public void Phnematics_staute(){
        m_Compressor.setClosedLoopControl(true);
    }

    @Override
    public void periodic(){
    }
}
