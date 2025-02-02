package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestCapacidadeM3Invalida {

    @Test
    public void testCapacidadeM3Invalida() {
        String capacidadeM3 = "100abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertFalse(obj.getCapacidadeM3().length() == 2 && !obj.getCapacidadeM3().isEmpty());
    }

}