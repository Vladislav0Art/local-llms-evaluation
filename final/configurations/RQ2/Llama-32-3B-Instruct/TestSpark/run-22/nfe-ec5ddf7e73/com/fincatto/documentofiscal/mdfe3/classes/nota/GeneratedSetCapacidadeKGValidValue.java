package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetCapacidadeKGValidValue {

    @Test
    public void setCapacidadeKGValidValue() {
        String value = "10";
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeKG(value);
        assertEquals(value, modal.getCapacidadeKG());
    }

}