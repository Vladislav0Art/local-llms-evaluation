package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Calendar;

public class Generated[setRenavam][ValidarRenavam]

Test {

    @Test
    public void [setRenavam][ValidarRenavam]Test() {
        final String renavam = "123456789";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setRenavam(renavam);
        assertEquals(renavam, object.getRenavam());
    }

}