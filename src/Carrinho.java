import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> itens;
    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        System.out.println(item.getNome() + " adicionado com sucesso! " + "R$ " + item.getPreco());
    }

    public void removerItem(Item item) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).equals(item)) {

                System.out.println(item.getNome() +"Item removido com sucesso!");
                itens.remove(i);
            }
        }
    }

    public void calcularPreco(){
        double valor = 0;
        for (int i = 0; i < itens.size(); i++){
            valor += itens.get(i).getPreco();
        }
        System.out.println("Total do pedido é de R$: " + valor);
    }
}
