package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetCodigoInterno_AlterarcodigoInterno deveAlterar codigoInterno {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInterno_AlterarcodigoInterno

    deveAlterar codigoInterno() {
        String alterado = "123456";
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(alterado);
        assertEquals(alterado, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}