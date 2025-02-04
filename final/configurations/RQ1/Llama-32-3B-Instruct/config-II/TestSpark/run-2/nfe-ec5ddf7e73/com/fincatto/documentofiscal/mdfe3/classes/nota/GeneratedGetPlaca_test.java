package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedGetPlaca_test {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getPlaca_test() {
        String placa = "ABC123";
        obj.setPlaca(placa);
        assertEquals(placa, obj.getPlaca());
    }

}