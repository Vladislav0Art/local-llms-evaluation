package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetTaraValidoTest {

    @Test
    public void setTaraValidoTest() {
        final String tara = "TARA";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertTrue(DFStringValidador.isValido(tara));
    }

}