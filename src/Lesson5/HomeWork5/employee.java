package Lesson5.HomeWork5;

import jdk.nashorn.internal.objects.annotations.Constructor;

public class employee {

    private  String FIO;
    private  String position;
    private  String email;
    private int numberPhone;
    private  int wage;
    public   int age;
    public employee(String FIO, String position, String email, int numberPhone,int wage, int age){
        this.FIO=FIO;
        this.position=position;
        this.email=email;
        this.numberPhone=numberPhone;
        this.wage=wage;
        this. age=age;
    }
   String fullInfo(){
      return "ФИО: " + this.FIO+" Должность:"+
       this.position+"  Электронная почта:"+
       this.email+ "  Номер телефона:"+
       this.numberPhone+
       this.wage+" рублей " +
       this.age+" лет.";

   }
}
