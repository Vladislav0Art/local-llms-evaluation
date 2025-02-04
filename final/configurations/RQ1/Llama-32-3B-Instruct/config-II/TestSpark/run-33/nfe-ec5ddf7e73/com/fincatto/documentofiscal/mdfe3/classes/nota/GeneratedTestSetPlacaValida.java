package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestSetPlacaValida {

    @Test
    public void testSetPlacaValida() {
        String placa = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setPlaca(placa);
        assertTrue(DFStringValidador.placaDeVeiculo(placa, "Placa do reboque"));
    }

}