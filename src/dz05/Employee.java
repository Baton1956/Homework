package dz05;

/* DZ05, Абрамов А
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

 */


class Employee {
    // выбираем набор полей для заполнения через конструктор
    String firstname, name, middlename, position, email;
    int salary, age;
    // Создаем конструктор класса  Employee
    // Ключевое слово this используем для того, чтобы отличить аргумент конструктора от поля объекта.
    Employee(String firstname,
             String name,
             String middlename,
             String position,
             String email,
             int salary,
             int age) {
        this.firstname = firstname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("firstname: " + firstname + " | name: " + name
                + " | middlename: " + middlename + " | position: " + position
                + " | email: " + email + " | salary: " + salary + " | age: "
                + age);
    }

    int getAge() {
        return age;
    }
}

