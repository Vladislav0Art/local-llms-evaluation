package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestRenavamValidada {

    @Test
    public void testRenavamValidada() {
        String renavam = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertTrue(obj.getRenavam().length() == 9 && !obj.getRenavam().isEmpty());
    }

}