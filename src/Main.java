public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();  // Объект класса Basket с лимитом 100.
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб",40);

        Basket petyaBasket = new Basket(5000); // Новая корзина на основе класса Basket с лимитом 500.
        petyaBasket.add("Лопата", 280, 2 , 2.1);
        petyaBasket.add("Бочка", 2900);

        Basket mashaBasket = new Basket(300);
        mashaBasket.add("Хрен", 22, 2,3.3);

        vasyaBasket.print("Корзина Васи: ");
        petyaBasket.print("Корзина Пети: ");
        mashaBasket.print("Корзина Маши: ");

        Product a = new Product("Сыр",50); // в данном случае a и b ссылаются на один и тот же объект в памяти.
        Product b = a;
        a.setName("Сок");
        System.out.println(a);
        System.out.println(b);



    }


}
