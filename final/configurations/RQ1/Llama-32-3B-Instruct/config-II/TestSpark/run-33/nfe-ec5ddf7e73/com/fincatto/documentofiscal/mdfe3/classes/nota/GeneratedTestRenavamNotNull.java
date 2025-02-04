package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestRenavamNotNull {

    @Test
    public void testRenavamNotNull() {
        String renavam = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setRenavam(renavam);
        assertNotNull(modal.getRenavam());
    }

}