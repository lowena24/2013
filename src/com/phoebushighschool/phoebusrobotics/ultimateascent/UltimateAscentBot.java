package com.PhoebusHighSchool.PhoebusRobotics.UltimateAscent;

import edu.wpi.first.wpilibj.SimpleRobot;
import java.util.Vector;
import edu.wpi.first.wpilibj.PIDController;

/*
 */
public class UltimateAscentBot extends SimpleRobot {

    protected AimingSystem visionSystem;
    protected TankDrive drive;
    public GameMech gameMech;
    public Vector  MyFRCMath;
    protected PIDController aimController;
    public Parameters param;

  public void operatorControl() {
  }

  public void autonomous() {
  }

  /** 
   *  This method will align the robot with the target +/- one degree
   */
  public void aim() {
  }

  /** 
   *  This method will check to see if the target is within +/- one degree of the center.
   */
  public boolean isAimedAtTarget() {
      return false;
  }

}