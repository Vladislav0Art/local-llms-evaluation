package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestSetCapacidadeKGValida {

    @Test
    public void testSetCapacidadeKGValida() {
        String capacidadeKG = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeKG(capacidadeKG);
        assertTrue(DFStringValidador.capacidadeNDigitos(capacidadeKG, "Capacidade em KG reboque", 5));
    }

}