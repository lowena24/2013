package com.PhoebusHighSchool.PhoebusRobotics.UltimateAscent;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;

public class Arm {

  protected boolean catchState;

  protected Relay motor;
  protected DigitalInput latchSwitch;
  protected DigitalInput outLimitSwitch;
  protected DigitalInput inLimitSwitch;
    
  public Arm(int latchSwitchchannel)
  {
      latchSwitch = new DigitalInput(1, latchSwitchchannel);
  }

  public void extend() 
  {
      motor.setDirection(Relay.Direction.kForward);
      if (isFullyExtended())
          motor.set(Relay.Value.kOff);
      else
          motor.set(Relay.Value.kOn);
  }

  public void retract() 
  {
      motor.setDirection(Relay.Direction.kReverse);
      if(isFullyRetracted())
      {
          stop();
      }
  }

  public boolean isLatched() 
  {
      if(latchSwitch.get())
        catchState = true;
      else catchState = false;
  return catchState;
  }
  
  public boolean isFullyExtended()
  {
      return outLimitSwitch.get();
  }
  
  public boolean isFullyRetracted()
  {
      return inLimitSwitch.get();
  }

  public void stop()
  {
      motor.set(Relay.Value.kOff);
  }

}