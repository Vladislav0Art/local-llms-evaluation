package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestCapacidadeM3Validada {

    @Test
    public void testCapacidadeM3Validada() {
        String capacidadeM3 = "100";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertTrue(obj.getCapacidadeM3().length() == 2 && !obj.getCapacidadeM3().isEmpty());
    }

}