package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedTestSetCodigoInterno {

    @Test
    public void testSetCodigoInterno() {
        final String codigoInterno = "12345";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertNotNull(mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}