package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetPlacaValidoTest {

    @Test
    public void setPlacaValidoTest() {
        final String placa = "PLACA";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertTrue(DFStringValidador.isValido(placa));
    }

}