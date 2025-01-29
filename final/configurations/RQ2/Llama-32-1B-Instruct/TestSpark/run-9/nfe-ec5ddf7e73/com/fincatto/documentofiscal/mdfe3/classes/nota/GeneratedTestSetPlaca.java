package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSetPlaca {

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque modelo = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "PL-ABC";
        modelo.setPlaca(placa);
        assertEquals(placa, modelo.getPlaca());
    }

}