package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCapacidadeM3_DadoValorValido_ReturnaCapacidadeM3Corretamente {

    @Test
    public void getCapacidadeM3_DadoValorValido_ReturnaCapacidadeM3Corretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "10";
        modal.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, modal.getCapacidadeM3());
    }

}