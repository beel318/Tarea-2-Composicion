package ico.fes.componentes;

public class Mouse {
  private String marca;
  private String modelo;
  private String tipo;

    public Mouse() {
    }

    public Mouse(String marca, String modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Mouse{" + "marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + '}';
    }  
}
