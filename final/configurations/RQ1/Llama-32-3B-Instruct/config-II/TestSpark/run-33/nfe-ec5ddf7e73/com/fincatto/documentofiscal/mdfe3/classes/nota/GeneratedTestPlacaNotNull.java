package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestPlacaNotNull {

    @Test
    public void testPlacaNotNull() {
        String placa = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setPlaca(placa);
        assertNotNull(modal.getPlaca());
    }

}