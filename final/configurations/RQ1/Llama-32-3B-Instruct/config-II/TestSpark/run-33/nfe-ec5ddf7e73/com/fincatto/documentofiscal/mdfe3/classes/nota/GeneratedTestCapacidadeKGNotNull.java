package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestCapacidadeKGNotNull {

    @Test
    public void testCapacidadeKGNotNull() {
        String capacidadeKG = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeKG(capacidadeKG);
        assertNotNull(modal.getCapacidadeKG());
    }

}