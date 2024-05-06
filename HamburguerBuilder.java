public interface HamburguerBuilder {
    HamburguerBuilder withTipoCarne(String tipoCarne);
    HamburguerBuilder withCebolla();
    HamburguerBuilder withLechuga();
    HamburguerBuilder withQueso();
    HamburguerBuilder withTomate();
    HamburguerBuilder withEverything();
    HamburguerBuilder withEverythingLessLechuga();
    Hamburguer build();
    CreateHamburguer reset();

}
