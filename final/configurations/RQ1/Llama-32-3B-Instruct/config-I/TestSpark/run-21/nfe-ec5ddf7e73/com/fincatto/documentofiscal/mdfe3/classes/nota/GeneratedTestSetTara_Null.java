package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetTara_Null {

    @Test
    public void testSetTara_Null() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = null;
        try {
            modal.setTara(tara);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }

}