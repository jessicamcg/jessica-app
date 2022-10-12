// i)  Create a washing machine class with methods as swtichO, acceptClothes, acceptDetergent, switchOFF.
//     acceptClothes accepts the noofClothes as argument & returns the no of Clothes.



package com.jessica;

public class WashingMachine {
  private boolean power;
  private int noofClothes;
  private String detergent;

  public WashingMachine(boolean p, int c, String d) {
    this.setPower(p);
    this.setNoofClothes(c);
    this.setDetergent(d);
  }

  public boolean isPower() {
    return power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }

  public int getNoofClothes() {
    return noofClothes;
  }

  public void setNoofClothes(int noofClothes) {
    this.noofClothes = noofClothes;
  }

  public String getDetergent() {
    return detergent;
  }

  public void setDetergent(String detergent) {
    this.detergent = detergent;
  }
}
