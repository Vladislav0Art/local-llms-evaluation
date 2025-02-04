package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

public class GeneratedSetPlaca PlacaDeVeiculo {

    @Test
    public void setPlaca

    PlacaDeVeiculo() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String placa = "1234567890";
        modalRodoviarioVeiculoReboque.setPlaca(placa);
        assertEquals(placa, modalRodoviarioVeiculoReboque.getPlaca());
    }

}