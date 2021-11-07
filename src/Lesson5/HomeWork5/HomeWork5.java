package Lesson5.HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee Employee1 = new Employee("Кондратьев Илья Вячеславович","Оператор","ilya.213@ryvd.ru",3423423,50000,25);
        Employee1.dossier();
        System.out.println("****************************************");
        Employee[] persArray = new Employee[5];
        persArray[0]= new Employee("Иванов Иван Иванович","Слесарь","iviv78@homr.ru",4676463,60000,56);
        persArray[1]=new Employee("Сергеев Сергей Сергеевич", "Токарь","jogygo@jmn.com",5546767,45000,44);
        persArray[2]=new Employee("Юрьева Оксана Вячеславовна", "Бухгалтер", "julia34@uyr.ru",2323242,35000,29);
        persArray[3]=new Employee("Черкасов Андрей Викторович", "Директор", "gdirector@tur.ru",3523535,70000,35);
        persArray[4]=new Employee("Незнайкин Олег Владимирович","Системный администратор", "sisadmin@ryiw.ru",3421312,50000,40);

        System.out.println("Сотрудники старше 40 лет: ");
        for (int i = 0; i <persArray.length ; i++) {
            if (persArray[i].age > 40){
                persArray[i].dossier();
                System.out.println();
            }
        }
    }

}
