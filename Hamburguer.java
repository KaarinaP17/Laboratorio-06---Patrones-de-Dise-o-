public class Hamburguer {
    protected String TipoCarne;
    protected boolean lechuga;
    protected boolean tomate;
    protected boolean cebolla;
    protected boolean queso;

    public Hamburguer(String tipoCarne, boolean lechuga, boolean tomate, boolean cebolla, boolean queso) {
        TipoCarne = tipoCarne;
        this.lechuga = lechuga;
        this.tomate = tomate;
        this.cebolla = cebolla;
        this.queso = queso;
    }

    public String toString(){
        return "\nEsta hamburguesa contiene \nTipo de carne: " + TipoCarne + "\nLechuga: " + lechuga + "\nTomate: " + tomate + "\nCebolla: " + cebolla + "\nQueso: " + queso;
    }
}
