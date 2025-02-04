package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestCodigoInternoNotNull {

    @Test
    public void testCodigoInternoNotNull() {
        String codigoInterno = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCodigoInterno(codigoInterno);
        assertNotNull(modal.getCodigoInterno());
    }

}