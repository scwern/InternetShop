import javax.lang.model.type.MirroredTypeException;
import javax.swing.plaf.basic.BasicLabelUI;
import javax.xml.namespace.QName;

public class Basket {
    private String items = "";
    private  int totalPrice = 0;
    private  int limit;
    private  double itemWeight;

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
    public Basket(String items, int totalPrice, double itemWeight){
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.itemWeight = itemWeight;
    }


    public void add(String name, int price){

        add(name, price, 1, 0);
    }

    public void clear(){  // очищаем корзину.
        items = "";
        totalPrice = 0;
        itemWeight = 0;
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
    public void add(String name, int price, int count, double weight){  // метод add позволяет добавить содержимое в корзину.
        if(contains(name)){   // проверяем есть ли уже товар, который мы пытаемся добавить.
            return;
        }
        if(totalPrice + count * price * weight >= limit){ // Проверяем превысили ли лимит.
            return;
        }



        items = items + "\n" + name + " - " + count + "шт.  цена: " + price + " весом: " + weight + "кг";
        totalPrice = totalPrice + count * price;

    }
}
