package ru.geekbrains.hw5;

class Employee {
    String fullName, position, email, phone;
    double salary;
    int age;

    Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void aboutEmployee() {
        System.out.printf("ФИО сотрудника: %s, возраст: %d, должность: %s, e-mail: %s, телефон: %s, ЗП: %f ", fullName, age, position, email, phone, salary);
        System.out.println("");
    }
}
