// i)  Create a washing machine class with methods as swtichO, acceptClothes, acceptDetergent, switchOFF.
//     acceptClothes accepts the noofClothes as argument & returns the no of Clothes.



package com.jessica;

public class WashingMachine {
  private boolean power;
  private int noofClothes;
  private String detergent;

  public WashingMachine() {
    this.setPower(false);
    this.setNoofClothes(0);
    this.setDetergent("");
  }

  public static void main(String[] args) {
    System.out.println("jessica's washing machine");
    WashingMachine wm = new WashingMachine();
    wm.acceptClothes(5);
    wm.acceptDetergent("tide");
    wm.switchOn();
    wm.switchOff();
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

  public void switchOn() {
    System.out.println("Power on..");
    this.setPower(true);
  }

  public void switchOff() {
    System.out.println("Power off..");
    this.setPower(false);
  }

  public int acceptClothes(int noofClothes) {
    this.setNoofClothes(noofClothes);
    System.out.println("Accepting " + this.getNoofClothes() + "...");
    return this.getNoofClothes();
  }

  public String acceptDetergent(String detergent) {
    this.setDetergent(detergent);
    System.out.println("Accepting " + this.getDetergent() + "...");
    return this.getDetergent();
  }
}
