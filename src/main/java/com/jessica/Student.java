// ii) Create a class Student which has following methods
//      i) Average: which would accept marks of 3 examinations & return whether the student has passed or failed depending on whether he
//     has scored an average above 50 or not?
//      ii) Input : which would accept the name of the student & returns the name?

package com.jessica;

public class Student {
  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(s1.input("jessica"));
    System.out.println(s1.average(60, 70, 80));
    
    Student s2 = new Student("melanie");
    System.out.println(s2.average(20, 40, 10));
  }

  private String name;

  public Student() {
    System.out.println("new student created");
  };

  public Student(String n) {
    this.setName(n);
    System.out.println("new student created: " + this.getName());
  };

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String average(int test1, int test2, int test3) {
    float average = (test1+test2+test3)/3;
    return average>50 ? "pass" : "fail";
  }

  public String input(String name) {
    this.setName(name);
    return this.getName();
  }
}
