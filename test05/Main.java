package test05;

public class Main {
    public static void main(String[] args) {
        //  Направете интерфейс IHuman.
        //  Създайте в него абстрактните методи: sleep(), eat(), walk().
        //  Направете интерфейс IStudent, който да наследява IHuman.
        //  В него да се добави метод study(). Да се направи клас Uktcar, който да имплементира интерфейса IStudent.
        //  Да се добави в него поле name. Всеки от методите трябва да изпечатва
        //  в конзолата: name + " is sleeping", name + " is eating", name + " is sleeping", name + " is studying".
        //  В метода main да се направи инстанция от класа Uktcar и да се извикат всички дефинирани методи.
        Uktcar person = new Uktcar("Valia");
        person.sleep();
        person.eat();
        person.study();
        person.walk();
    }

}
