package utilidade;

import modelo.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int qtde){
            itemList.add(new Item(nome, preco, qtde));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNomeItem().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public float calcularValorTotal(){
        float valorTotal = 0, valorTotalItem = 0;
        for(Item i : itemList){
            valorTotalItem = i.getQtdeItem() * i.getPrecoItem();
            valorTotal += valorTotalItem;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

}
