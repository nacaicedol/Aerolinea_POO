package data;

public class Fecha {
  private String año;
  private String mes;
  private String dia;
  private String diasem;
  private String hora;
  private String minutos;

    public Fecha(String año, String mes, String dia, String diasem, String hora, String minutos) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.diasem = diasem;
        this.hora = hora;
        this.minutos = minutos;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDiasem() {
        return diasem;
    }

    public void setDiasem(String diasem) {
        this.diasem = diasem;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Fecha{" + "a\u00f1o=" + año + ", mes=" + mes + ", dia=" + dia + ", diasem=" + diasem + ", hora=" + hora + ", minutos=" + minutos + '}';
    }
    
}
