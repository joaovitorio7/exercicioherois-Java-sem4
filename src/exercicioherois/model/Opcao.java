package exercicioherois.model;

import exercicioherois.exception.OpcaoInvalidaException;

public enum Opcao {

    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;

    public static Opcao converter(int codigo) throws OpcaoInvalidaException {
        if (codigo == 0 || codigo > 4)
            throw new OpcaoInvalidaException("Opcao Inválida");
        if (codigo == 4)
            return SAIR;
        return Opcao.values()[codigo - 1];
    }

}
