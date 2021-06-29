import javax.swing.plaf.basic.BasicLabelUI;
import javax.xml.namespace.QName;

public class Basket {
    private String items = "";
    private  int totalPrice = 0;
    private  int limit;

    public Basket(){  // конструктор без параметров, чтобы необязательно было создавать лимит.
        items = "Список товаров: ";
        this.limit = 100000;
    }

    public Basket(int limit){
        this();
        this.limit = limit; //this - обозначаем переменную класса.
    //public Basket(int totalPriceLimit){ // конструктор.
        //limit = totalPriceLimit;
    }
    public Basket(String items, int totalPrice){
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }


    public void add(String name, int price){

        add(name, price, 1);
    }

    public void clear(){  // очищаем корзину.
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice(){   // получаем полную стоимость товаров из корзины.
        return totalPrice;
    }

    public boolean contains(String name){    // проверяем существует ли в корзине товар по его имени.
        return items.contains(name);

       // if (items.contains((name)){    - более развернутая запись строки выше.
         //   return true;

        //return  false;
    }

    public void print(String title){  // метод print показывает содержимое корзины.
        System.out.println(title);
        if(items.isEmpty()){
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
    public void add(String name, int price, int count){  // метод add позволяет добавить содержимое в корзину.
        if(contains(name)){   // проверяем есть ли уже товар, который мы пытаемся добавить.
            return;
        }
        if(totalPrice + count * price >= limit){ // Проверяем превысили ли лимит.
            return;
        }
        items = items + "\n" + name + " - " + count + "шт. - " + price;
        totalPrice = totalPrice + count * price;

    }
}
