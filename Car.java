package Udemy_Course_1;

public class Car {                        //класс с параметрами авто

    String color;
    String engine;
    int speed;

    int gaz(int skorost) {                //метод для увеличения скорости
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {              //метод для снижения скорости
        speed -= skorost;
        return speed;
    }

    void ShowInfo() {                      //метод выводит информацию об авто
        System.out.println("cvet " + color + ", motor " + engine + ", skorost " + speed);
    }
}

class CarInfo {
    public static void main(String[] args) {
        Car auto = new Car();             //создание объекта класса Car
        auto.color = "black";
        auto.engine = "V8";
        auto.speed = 50;

        auto.ShowInfo();                  //вывод информации об авто
        auto.gaz(40);
        auto.ShowInfo();
        auto.tormoz(90);
        auto.ShowInfo();
    }
}