package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestCapacidadeM3NotNull {

    @Test
    public void testCapacidadeM3NotNull() {
        String capacidadeM3 = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeM3(capacidadeM3);
        assertNotNull(modal.getCapacidadeM3());
    }

}