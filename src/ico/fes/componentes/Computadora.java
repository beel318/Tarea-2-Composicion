package ico.fes.componentes;

public class Computadora {
    private String marca;
    private String modelo;
    //COMPOSICION
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;
    private Cpu cpu;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Monitor monitor, Mouse mouse, Teclado teclado, Cpu cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
        this.cpu = cpu;
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

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", monitor=" + monitor + ", mouse=" + mouse + ", teclado=" + teclado + ", cpu=" + cpu + '}';
    }
}

    