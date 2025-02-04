package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedGetCodigoInterno_test {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getCodigoInterno_test() {
        String codigoInterno = "1234567890";
        obj.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, obj.getCodigoInterno());
    }

}