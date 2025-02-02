package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestPlacaInvalida {

    @Test
    public void testPlacaInvalida() {
        String placa = "ABC";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertFalse(obj.getPlaca().length() == 7 && !obj.getPlaca().isEmpty());
    }

}