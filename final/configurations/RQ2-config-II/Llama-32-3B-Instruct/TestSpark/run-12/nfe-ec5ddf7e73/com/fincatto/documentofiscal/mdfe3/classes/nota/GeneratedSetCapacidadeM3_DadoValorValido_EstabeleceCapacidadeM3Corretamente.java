package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCapacidadeM3_DadoValorValido_EstabeleceCapacidadeM3Corretamente {

    @Test
    public void setCapacidadeM3_DadoValorValido_EstabeleceCapacidadeM3Corretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "10";
        modal.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, modal.getCapacidadeM3());
    }

}