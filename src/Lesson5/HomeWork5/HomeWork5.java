package Lesson5.HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        employee myPerson = new employee("Кондратьев Илья Вячеславович","Оператор","ilya.213@ryvd.ru",3423423,50000,25);

        System.out.println("****************************************");
        employee[] officeCompany = {
        new employee("Иванов Иван Иванович","Слесарь","iviv78@homr.ru",4676463,60000,56),
        new employee("Сергеев Сергей Сергеевич", "Токарь","jogygo@jmn.com",5546767,45000,44),
        new employee("Юрьева Оксана Вячеславовна", "Бухгалтер", "julia34@uyr.ru",2323242,35000,29),
        new employee("Черкасов Андрей Викторович", "Директор", "gdirector@tur.ru",3523535,70000,35),
       new employee("Незнайкин Олег Владимирович","Системный администратор", "sisadmin@ryiw.ru",3421312,50000,40)
        };
        getOldPerson(officeCompany,40);

    }
     public static void getOldPerson(employee[] officeCompany, int year) {
         System.out.println("Сотрудники старше "+year+" лет: " );
        for (int i = 0; i < officeCompany.length; i++) {
             if (officeCompany[i].age > year) {

                 System.out.println( officeCompany[i].fullInfo());
             }
         }
     }}