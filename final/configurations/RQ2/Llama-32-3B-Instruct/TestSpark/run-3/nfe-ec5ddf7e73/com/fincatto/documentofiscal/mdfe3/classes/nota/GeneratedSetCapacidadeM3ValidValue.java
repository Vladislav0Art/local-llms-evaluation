package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.function.Consumer;

public class GeneratedSetCapacidadeM3ValidValue {

    @Test
    public void setCapacidadeM3ValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3("10");
        assertEquals(10, Double.parseDouble(obj.getCapacidadeM3()));
    }

}