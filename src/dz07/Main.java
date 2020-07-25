package dz07;



public class Main
{
    public static void main(String[] args)
    {

        Cat[] x = {new Cat("Серый", 7), new Cat("Черный", 5), new Cat("Белый", 10)};
        Plate plate = new Plate(28); // задаем количество еды в тарелке

        System.out.println(" Все кошки голодные");
        System.out.println("***********************************************");
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("***********************************************");
        System.out.println("\n" + plate);
        System.out.println("***********************************************");

        System.out.println("Кошки едят:");
        for (Cat c : x)  // Цикл выводит название , величину аппетита , сытость кошек и остаток еды в тарелке
        {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}

