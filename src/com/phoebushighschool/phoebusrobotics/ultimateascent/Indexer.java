package com.phoebushighschool.phoebusrobotics.ultimateascent;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;

/*
 */
public class Indexer {
    protected Relay indexer;
    protected DigitalInput discPreIndex;
    public int discCountCurrent;
    public boolean indexerHasRun;
    public boolean indexerDiscPass;
    
  public Indexer()
  {
      indexer = new Relay(Parameters.DiscIndexerSolenoidChannel);
      
  }
  /** 
   *  This method will index one disc into the shooter.
   */
      
  public void setIndexerPiston(boolean value){
      Relay.Direction direction;
      if (value)
          direction = Relay.Direction.kForward;
      else 
          direction = Relay.Direction.kReverse;
      indexer.setDirection(direction);
  }

  public boolean isDiscLoaded() {  
    return discPreIndex.get();
  }
  
  public int getDiscCountCurrent() {
      return discCountCurrent;
  }
}