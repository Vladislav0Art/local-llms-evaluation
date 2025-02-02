package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestCodigoInternoValidado {

    @Test
    public void testCodigoInternoValidado() {
        String codigoInterno = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertTrue(obj.getCodigoInterno().length() == 10 && !obj.getCodigoInterno().isEmpty());
    }

}