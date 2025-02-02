package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestCapacidadeKGValidada {

    @Test
    public void testCapacidadeKGValidada() {
        String capacidadeKG = "100";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertTrue(obj.getCapacidadeKG().length() == 3 && !obj.getCapacidadeKG().isEmpty());
    }

}