//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Bora bora");

        Item item1 = new Item("X-Burger", 12.99, 1);
        Item item2 = new Item("X-Frango", 11.99, 2);
        Item item3 = new Item("Coca-Cola", 5.99, 3);
        Item item4 = new Item("Guaraná", 3.99, 4);

        Carrinho c= new Carrinho();

        c.adicionarItem(item1);
        c.adicionarItem(item2);
        c.adicionarItem(item2);
        c.adicionarItem(item3);
        c.adicionarItem(item4);

        c.removerItem(item4);
        c.adicionarItem(item3);
        c.calcularPreco();

    }
}