package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedSetTaraSetValidString_SetCorrectly {

    @Test
    public void setTaraSetValidString_SetCorrectly() {
        final String tara = "0.00";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setTara(tara);
        assertTrue(DFStringValidador.isValido(tara));
    }

}