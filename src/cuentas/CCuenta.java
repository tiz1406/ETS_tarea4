package cuentas;

/**
 * Esta clase contiene los atributos y metodos de una cuenta
 *
 * @author Emperatriz Fernandez Ramirez
 * @version 1.0
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Metodo constructor sin parámetros
     */
    public CCuenta() {
    }

    /**
     * Metodo constructor con parámetros
     *
     * @param nom nombre del titular de la cuenta
     * @param cue numero de cuenta
     * @param sal saldo actual
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el nombre del titular
     *
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del titular
     *
     * @param nombre nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta
     *
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica el número de cuenta
     *
     * @param cuenta número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual
     *
     * @return saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo actual
     *
     * @param saldo saldo actual
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés
     *
     * @return tipo de interés
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Modifica el tipo de interés
     *
     * @param tipoInteres tipo de interés
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Metodo para mostrar el saldo actual de la cuenta
     *
     * @return saldo actual
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para ingresar cantidad en la cuenta. Actualiza el saldo actual
     *
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar cantidad en la cuenta. Actualiza el saldo actual
     *
     * @param cantidad Cantidad a retirar
     * @throws Exception si la cantidad es negativa o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
