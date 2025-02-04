package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedGetRenavam_test {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getRenavam_test() {
        String renavam = "123456789";
        obj.setRenavam(renavam);
        assertEquals(renavam, obj.getRenavam());
    }

}