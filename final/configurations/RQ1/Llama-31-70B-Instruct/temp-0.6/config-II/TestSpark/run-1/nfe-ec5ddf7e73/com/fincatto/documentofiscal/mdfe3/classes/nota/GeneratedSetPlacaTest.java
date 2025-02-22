package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque testClass = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "AAA1234";

        testClass.setPlaca(placa);

        assertEquals("AAA1234", testClass.getPlaca());
    }

}