package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedSetCapacidadeKGSetValidString_SetCorrectly {

    @Test
    public void setCapacidadeKGSetValidString_SetCorrectly() {
        final String capacidadeKG = "10";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setCapacidadeKG(capacidadeKG);
        assertTrue(DFStringValidador.isValido(capacidadeKG));
    }

}