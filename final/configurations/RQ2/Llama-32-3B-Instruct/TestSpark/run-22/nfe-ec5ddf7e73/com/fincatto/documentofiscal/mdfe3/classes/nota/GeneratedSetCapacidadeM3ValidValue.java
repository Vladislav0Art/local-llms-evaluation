package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetCapacidadeM3ValidValue {

    @Test
    public void setCapacidadeM3ValidValue() {
        String value = "10";
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeM3(value);
        assertEquals(value, modal.getCapacidadeM3());
    }

}