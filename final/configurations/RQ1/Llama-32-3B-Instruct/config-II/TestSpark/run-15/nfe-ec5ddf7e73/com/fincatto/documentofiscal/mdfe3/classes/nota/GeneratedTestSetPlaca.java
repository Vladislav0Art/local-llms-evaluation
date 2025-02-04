package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Optional;

public class GeneratedTestSetPlaca {

    @Test
    public void testSetPlaca() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboleq reboque = new MDFInfoModalRodoviarioVeiculoReboleq();
        reboque.setPlaca(placa);
        assertEquals(placa, reboque.getPlaca());
    }

}