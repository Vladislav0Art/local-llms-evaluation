package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetPlacaInvalidoTest {

    @Test
    public void setPlacaInvalidoTest() {
        final String placa = "PLACA";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertFalse(DFStringValidador.isValido(placa));
    }

}