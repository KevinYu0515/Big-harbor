/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    
    public static class PowCon{
        
        public static final double flywheel_kF = 0.506; 
        public static final double flywheel_kP = 0.1;

        public static final double flywheelvel = 12000;
    }

    public static class chassis{

		public static final int leftMaster = 19;
		public static final int leftFollewer = 18;
        public static final int rightMaster = 21;
        public static final int rightFollower = 20;
         
    }

	public static final int kTimeoutMs = 30;

    public static class Button{
        public static final int arm_in = 1;
        public static final int arm_out = 2;

    }

	 
}
