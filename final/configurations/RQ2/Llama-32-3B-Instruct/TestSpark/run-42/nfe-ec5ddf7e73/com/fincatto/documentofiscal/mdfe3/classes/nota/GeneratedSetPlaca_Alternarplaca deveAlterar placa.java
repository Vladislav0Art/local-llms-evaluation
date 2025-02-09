package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetPlaca_Alternarplaca deveAlterar placa {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setPlaca_Alternarplaca

    deveAlterar placa() {
        String alterado = "ABC123";
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(alterado);
        assertEquals(alterado, mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}