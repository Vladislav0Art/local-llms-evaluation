package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetTaraInvalidoTest {

    @Test
    public void setTaraInvalidoTest() {
        final String tara = "TARA";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertFalse(DFStringValidador.isValido(tara));
    }

}