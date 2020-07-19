package dz05;

public class MainClass {
    public static void main(String[] args) {
        // Вызываем  конструктор класса  Employee
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich",
                "Top manager", "iv@mail.me", 60000, 45);
        employees[1] = new Employee("Petrov", "Petr", "Petrovich", "manager",
                "petr@mail.me", 40000, 30);
        employees[2] = new Employee("Sidorov", "Sidor", "Sidorovich",
                "manager", "sidor@mail.me", 45000, 41);
        employees[3] = new Employee("Rulov", "Rul", "Rulovich",
                "manager", "rul@mail.me", 650000, 47);
        employees[4] = new Employee("Semenov", "Semen", "Semenovich",
                "manager", "sem@mail.me", 30000, 28);
        // Вывод на печать сотрудников, чей возраст > 40

        for (Employee e : employees) {
            if (e.getAge() > 40) {
                e.getFullInfo();
            }
        }
}
}
