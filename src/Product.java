public class Product { // классический pojo класс.
    private String name; // создаем неизменную переменную.
    private final int price;

    public Product(String name, int price){ //конструктор с параметрами типа string, int.
        this.name = name;
        this.price = price;
    }


    public String getName(){ //геттер для name;
        return name;
    }
    public void setName(String name){ // сеттер для name;
        this.name = name;
    }


    public int getPrice(){ //геттер для price;
        return price;
    }
    public Product setName(int price){ // переписываем содержимое сеттера, чтобы в нем создалась копия исходного объекта.
        return new Product(name, price);
    }

    public String toString(){
        return name + " - " + price;
    }
}
