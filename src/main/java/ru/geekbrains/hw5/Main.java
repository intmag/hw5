package ru.geekbrains.hw5;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иванов Сергей Дмитриевич", "Генеральный директор", "director@ya.ru", "+79998887766", 250756.43, 45);

        employee[1] = new Employee("Сидоров Александр Иванович", "Бухгалтер", "buh@ya.ru", "+79998887765", 150456.15, 42);
        employee[2] = new Employee("Елизарова Ирина Михайловна", "Менеджер", "sale1@ya.ru", "+79998887764", 122776.32, 33);
        employee[3] = new Employee("Меликджанян Калуст Мартинович", "Водитель", "drive@ya.ru", "+79998887763", 90347.05, 38);
        employee[4] = new Employee("Василенко Елена Анатольевна", "Уборщица", "clean@ya.ru", "+79998887762", 75003.15, 55);
        for (Employee em : employee) {
            if (em.age > 40){
                em.aboutEmployee();
            }
        }
    }
}
