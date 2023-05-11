package src;

public class CronogramaAlimentarCantina {
    public String energetico;
    public String refrigerante;
    public String salgadinho;
    public String bolacha;
    public String bala;
    public String chiclete;

    public String verificarHoraDoRango() {
        if (energetico != null || refrigerante != null || salgadinho != null || bolacha != null || bala != null || chiclete != null) {
            return "É hora do rango!";
        } else {
            return "Não é hora do rango!";
        }
}