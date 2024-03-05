package modelo;

public class Item {
    private String nomeItem;
    private float precoItem;
    private int qtdeItem;

    public Item(String nomeItem, float precoItem, int qtdeItem) {
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
        this.qtdeItem = qtdeItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        this.precoItem = precoItem;
    }

    public int getQtdeItem() {
        return qtdeItem;
    }

    public void setQtdeItem(int qtdeItem) {
        this.qtdeItem = qtdeItem;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nomeItem='" + nomeItem + '\'' +
                ", precoItem=" + precoItem +
                ", qtdeItem=" + qtdeItem +
                '}';
    }
}
