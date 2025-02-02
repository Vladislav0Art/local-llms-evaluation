package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetCapacidadeM3_Null {

    @Test
    public void testSetCapacidadeM3_Null() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = null;
        try {
            modal.setCapacidadeM3(capacidadeM3);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }

}