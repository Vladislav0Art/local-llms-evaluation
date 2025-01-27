package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.function.Consumer;

public class GeneratedSetCapacidadeKGValidValue {

    @Test
    public void setCapacidadeKGValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG("10");
        assertEquals(10, Integer.parseInt(obj.getCapacidadeKG()));
    }

}