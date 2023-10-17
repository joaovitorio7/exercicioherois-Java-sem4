package exercicioherois.model;

public enum Opcao {

    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;

    public static Opcao converter(int codigo){
        if (codigo == 0 || codigo > 4)
            throw new IllegalArgumentException("Opcao Inválida");
        if (codigo == 4)
            return SAIR;
        return Opcao.values()[codigo - 1];
    }

}
