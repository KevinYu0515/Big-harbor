package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.pneumatics.Arm;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ArmIn extends CommandBase{
    private Arm m_arm;
    
	public  ArmIn(Arm arm) {
        m_arm = arm ;
        addRequirements(m_arm);
      }
    @Override
      public void initialize() {
      }
    
      // Called every time the scheduler runs while the command is scheduled.
    @Override
      public void execute() {
        m_arm.Arm_off();
        SmartDashboard.putString("ArmStatus", "armIn");
      }
    
      // Called once the command ends or is interrupted.
    @Override
      public void end(boolean interrupted) {
      }
    
      // Returns true when the command should end.
    @Override
      public boolean isFinished() {
        return false;
      }
}