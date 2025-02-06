package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCapacidadeKG_DadoValorValido_EstabeleceCapacidadeKgCorretamente {

    @Test
    public void setCapacidadeKG_DadoValorValido_EstabeleceCapacidadeKgCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "10";
        modal.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, modal.getCapacidadeKG());
    }

}