package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedTestSetPlaca {

    @Test
    public void testSetPlaca() {
        final String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertNotNull(mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}