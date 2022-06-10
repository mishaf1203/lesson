public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var box = 5;
        System.out.println(box);
        box = box + 4;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 9;
        System.out.println(box);

        var lCapacity = 50;
        var stuffWeight = 20;
        var cLeft = lCapacity - stuffWeight;
        System.out.println("Еще можно положить " + cLeft + "кг вещей");

        var applesWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = applesWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var peppersWeight = 2;
        var zucchinWeight = 2;

        var vegetablesWeight = tomatoesWeight + cucumberWeight + peppersWeight + zucchinWeight;
        var productsWeight =fruitWeight +  vegetablesWeight + meatWeight + waterWeight ;
        System.out.println("Общий вес продуктов " + productsWeight + "кг" );

        var leftWeight = lCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + "кг" );

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight + "кг");

        leftWeight = lCapacity -stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + "кг");

        var overload = (stuffWeight + productsWeight) % lCapacity;
        System.out.println("Перегруз на "+ overload  + "кг" );

        var productsInOneCar = productsWeight / 2;
        System.out.println("продуктов в одной машине теперь " + productsInOneCar );

        byte bananas = 100;
        System.out.println("Бананов " + bananas + " кг" );

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит  " + onePortion + "кг" );

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a + 1f;
        System.out.println(g);


    }
}




