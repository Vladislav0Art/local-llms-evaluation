package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestPlacaValidada {

    @Test
    public void testPlacaValidada() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertTrue(obj.getPlaca().length() == 7 && !obj.getPlaca().isEmpty());
    }

}