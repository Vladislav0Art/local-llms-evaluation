package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCapacidadeKG_DadoValorValido_ReturnaCapacidadeKgCorretamente {

    @Test
    public void getCapacidadeKG_DadoValorValido_ReturnaCapacidadeKgCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "10";
        modal.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, modal.getCapacidadeKG());
    }

}