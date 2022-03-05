package Aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Manuel
 */
public class Aro {

    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    
    /**
     * Obtén o valor da coordenada X
     * @return o valor da coordenada X
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Establece o valor da coordenadaX
     * @param coordenadaX 
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Obtén o valor da coordenada Y
     * @return o valor da coordenada Y
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Establece o valor da coordenadaY
     * @param coordenadaY 
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Obtén o valor do radio
     * @return o valor do radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece o valor do radio
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio=(radio < MINIMO ? MINIMO : radio);
    }
    
    /**
     * Valor da constante MINIMO
     */
    public static final double MINIMO = 0.0;
    
    /**
     * Valor da constante LIMITERADIO
     */
    public static final double LIMITERADIO = 0.0;
    
    /**
     * Constructor por defecto
     */
    public Aro() {
    }

    /**
     * Constructor dos 3 parámetros
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Calcula o diámetro do aro
     * @return double que é o diámetro do aro
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * Calcula o perímetro do aro
     * @return double que é o perímetro do aro 
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Calcula a área do aro
     * @return double que é a área do aro 
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Engade á coordenada X o valor de trasladarX, e á coordenada Y o valor de trasladarY
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}