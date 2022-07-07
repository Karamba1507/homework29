package Task1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);


        //Сортировка по породе

        Collections.sort(cats,(Comparator<Cat>)(o1, o2) -> o1.getBreed().name().compareTo(o2.getBreed().name()));
        System.out.println("===========================================|");
        System.out.println("             Sorting by breed:             |");
        System.out.println("-----------+-----+------------+------------|");
        Printer.print(cats);


        //Сортировка по имени и возрасту

        cats.sort((Comparator<Cat>)Comparator.comparing(Cat :: getName).thenComparingInt(Cat :: getAge));
        System.out.println("===========================================|");
        System.out.println("          Sorting by name and age:         |");
        System.out.println("-----------+-----+------------+------------|");
        Printer.print(cats);

        //Удалять из списка всех котов определенного цвета

        cats.removeIf(cat -> (cat.getColor().equals(Cat.Color.GINGER)));
        System.out.println("===========================================|");
        System.out.println("          Del by color - Ginger:           |");
        System.out.println("-----------+-----+------------+------------|");
        Printer.print(cats);

        //Удалять из списка всех котов, длина имени которых равна 5 символам

        cats.removeIf(cat -> (cat.getName().length() == 5));
        System.out.println("===========================================|");
        System.out.println("Removed names whose length is 5 characters:|");
        System.out.println("-----------+-----+------------+------------|");
        Printer.print(cats);

    }


}
