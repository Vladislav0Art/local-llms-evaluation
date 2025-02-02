package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestCapacidadeKGInvalida {

    @Test
    public void testCapacidadeKGInvalida() {
        String capacidadeKG = "100abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertFalse(obj.getCapacidadeKG().length() == 3 && !obj.getCapacidadeKG().isEmpty());
    }

}