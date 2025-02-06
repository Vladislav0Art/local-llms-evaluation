package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCapacidadeKGGet_Satisfactorio_DadoValorValido {

    @Test
    public void capacidadeKGGet_Satisfactorio_DadoValorValido() {
        String capacidadeKG = "capacidade_kg";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, objeto.getCapacidadeKG());
    }

}