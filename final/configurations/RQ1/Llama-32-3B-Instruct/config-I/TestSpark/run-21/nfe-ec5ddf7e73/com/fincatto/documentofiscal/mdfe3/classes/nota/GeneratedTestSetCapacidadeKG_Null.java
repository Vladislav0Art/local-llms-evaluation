package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetCapacidadeKG_Null {

    @Test
    public void testSetCapacidadeKG_Null() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = null;
        try {
            modal.setCapacidadeKG(capacidadeKG);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }

}