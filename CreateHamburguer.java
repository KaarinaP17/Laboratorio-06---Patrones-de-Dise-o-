public class CreateHamburguer implements HamburguerBuilder{

    private Hamburguer hamburguerActual;

    public CreateHamburguer(){
        this.hamburguerActual = new Hamburguer(" ", false, false, false, false);
    }

    @Override
    public HamburguerBuilder withTipoCarne(String tipoCarne) {
        this.hamburguerActual.TipoCarne = tipoCarne;
        return this;
    }

    @Override
    public HamburguerBuilder withCebolla() {
        this.hamburguerActual.cebolla = true;
        return this;
    }

    @Override
    public HamburguerBuilder withLechuga() {
        this.hamburguerActual.lechuga = true;
        return this;
    }

    @Override
    public HamburguerBuilder withQueso() {
        this.hamburguerActual.queso = true;
        return this;
    }

    @Override
    public HamburguerBuilder withTomate() {
        this.hamburguerActual.tomate = true;
        return this;
    }

    @Override
    public HamburguerBuilder withEverything() {
        this.hamburguerActual.lechuga = true;
        this.hamburguerActual.queso = true;
        this.hamburguerActual.tomate = true;
        this.hamburguerActual.cebolla = true;
        return this;
    }

    @Override
    public HamburguerBuilder withEverythingLessLechuga() {
        this.hamburguerActual.queso = true;
        this.hamburguerActual.tomate = true;
        this.hamburguerActual.cebolla = true;
        return this;
    }

    @Override
    public Hamburguer build() {
        Hamburguer hamburguer = hamburguerActual;
        return hamburguer;
    }

    @Override
    public CreateHamburguer reset() {
        this.hamburguerActual = new Hamburguer(" ", false, false, false, false);
        return this;
    }
}
