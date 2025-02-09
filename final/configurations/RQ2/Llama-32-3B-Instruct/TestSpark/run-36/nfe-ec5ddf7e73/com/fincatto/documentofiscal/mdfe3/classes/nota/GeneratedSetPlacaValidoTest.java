package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetPlacaValidoTest {

    @Test
    public void setPlacaValidoTest() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertFalse(obj.getPlaca().isEmpty());
    }

}