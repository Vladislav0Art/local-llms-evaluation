package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestRenavamInvalida {

    @Test
    public void testRenavamInvalida() {
        String renavam = "1234567";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertFalse(obj.getRenavam().length() == 9 && !obj.getRenavam().isEmpty());
    }

}