package Lesson5.HomeWork5;

import jdk.nashorn.internal.objects.annotations.Constructor;

public class Employee {

    String FIO;
    String position;
    String email;
    int numberPhone;
    int wage;
    int age;
   public Employee(String FIO,String position,String email, int numberPhone, int wage, int age){
       this.FIO=FIO;
       this.position=position;
       this.email=email;
       this.numberPhone=numberPhone;
       this.wage=wage;
       this.age=age;

   }
   public void dossier(){
       System.out.println("Сотрудник: "+FIO+"  || Возраст - "+age+" лет.");
       System.out.println("Номер телефона: "+numberPhone);
       System.out.println("Должность: "+position);
       System.out.println("Зарплата: "+wage +" рублей");
   }
}
