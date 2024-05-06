public class Main {
    public static void main(String[] args) {
        CreateHamburguer cocina = new CreateHamburguer();

        Hamburguer hamburguer1 = cocina.reset().withTipoCarne("Pollo").withLechuga().withTomate().build();
        Hamburguer hamburguer2 = cocina.reset().withEverythingLessLechuga().withTipoCarne("Carne de Res").build();
        Hamburguer hamburguer3 = cocina.reset().withEverything().withTipoCarne("Tocino").build();
        System.out.println(hamburguer1.toString());
        System.out.println(hamburguer2.toString());
        System.out.println(hamburguer3.toString());
    }
}
