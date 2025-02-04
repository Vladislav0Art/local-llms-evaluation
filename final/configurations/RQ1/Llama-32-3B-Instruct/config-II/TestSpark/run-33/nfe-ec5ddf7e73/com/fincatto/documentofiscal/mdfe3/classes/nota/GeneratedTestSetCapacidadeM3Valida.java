package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestSetCapacidadeM3Valida {

    @Test
    public void testSetCapacidadeM3Valida() {
        String capacidadeM3 = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeM3(capacidadeM3);
        assertTrue(DFStringValidador.capacidadeNDigitos(capacidadeM3, "Capacidade em M3 reboque", 2));
    }

}