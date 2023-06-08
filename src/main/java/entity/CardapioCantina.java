package entity;

public class CardapioCantina {
    public String cardapioCantina;

    public CardapioCantina(String cardapioCantina) {
        this.cardapioCantina = cardapioCantina;
    }

    public String getCardapioCantina() {
        return cardapioCantina;
    }

    public void setCardapioCantina(String cardapioCantina) {
        this.cardapioCantina = cardapioCantina;
    }

    public void menuCardapio() {
        System.out.println("Energético......................R$13,50");
        System.out.println("Refrigerante.....................R$4,50");
        System.out.println("Salgadinho.......................R$7,90");
        System.out.println("Bolacha..........................R$3,50");
        System.out.println("Bala.............................R$1,00");
        System.out.println("Chiclete.........................R$0,70");
    }
}
