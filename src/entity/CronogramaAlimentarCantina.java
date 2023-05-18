package src.entity;

public class CronogramaAlimentarCantina {

  public String energetico;
  public String refrigerante;
  public String salgadinho;
  public String bolacha;
  public String bala;
  public String chiclete;

  public String verificarHoraDoRango() {
    if (energetico != null || refrigerante != null || salgadinho != null || bolacha != null
        || bala != null || chiclete != null) {
      return "É hora do rango!";
    } else {
      return "Não é hora do rango!";
    }

  }

  public String getEnergetico() {
    return energetico;
  }

  public void setEnergetico(String energetico) {
    this.energetico = energetico;
  }

  public String getRefrigerante() {
    return refrigerante;
  }

  public void setRefrigerante(String refrigerante) {
    this.refrigerante = refrigerante;
  }

  public String getSalgadinho() {
    return salgadinho;
  }

  public void setSalgadinho(String salgadinho) {
    this.salgadinho = salgadinho;
  }

  public String getBolacha() {
    return bolacha;
  }

  public void setBolacha(String bolacha) {
    this.bolacha = bolacha;
  }

  public String getBala() {
    return bala;
  }

  public void setBala(String bala) {
    this.bala = bala;
  }

  public String getChiclete() {
    return chiclete;
  }

  public void setChiclete(String chiclete) {
    this.chiclete = chiclete;
  }

  public CronogramaAlimentarCantina(String energetico, String refrigerante, String salgadinho, String bolacha, String bala, String chiclete) {
    this.energetico = energetico;
    this.refrigerante = refrigerante;
    this.salgadinho = salgadinho;
    this.bolacha = bolacha;
    this.bala = bala;
    this.chiclete = chiclete;
  }
}