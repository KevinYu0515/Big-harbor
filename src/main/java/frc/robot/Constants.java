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
        //Xbox，我不太想把 driver station 帶去高雄，所以用Xbox代替
        public static final int flywheelSpin = 1;      //飛輪啟用
        public static final int conveyor = 2;          //送球
        public static final int turretleft = 3;        //轉塔左
        public static final int turretRight = 4;       //轉塔右
        public static final int rack_up = 5;           //齒條上升
        public static final int rack_down = 6;         //齒條下降
        public static final int intake = 7;            //送球保險
        public static final int autoaim = 8;           //自動瞄準
        //可能會有按鈕錯，畢竟我沒去對Xbox

        //Joystick
        public static final int arm_in = 1;            //手臂進來
        public static final int arm_out = 2;           //手臂出去
        public static final int towerZero = 3;         //轉塔歸零
        public static final int rackZero = 4;          //齒條歸零
        public static final int emergency_shoot = 5;   //緊急發射
        public static final int intake_opp = 6;        //進球反轉(包括送球三個馬達+吸球)
        public static final int hanging_up = 7;        //吊掛上升
        public static final int hanging_down = 8;      //吊掛下降
    }

    public static class Pne{
        public static final int ArmDS_1 = 0;           //雙電磁閥腳位1
        public static final int ArmDS_2 = 1;           //雙電磁閥腳位2

    }

	 
}
