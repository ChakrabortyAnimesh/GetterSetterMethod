package com.company.java;

public class Person {
  private   String name;
   private int age;

   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return name;
   }
   public void setAge(int age){
       this.age=age;
   }
   public int getAge(){
       return age;
   }
   public void info(){

      setName(name);
       setAge(age);
       System.out.println("Your name is "+getName()+" and your age is "+getAge());
   }
}
