package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.function.Consumer;

public class GeneratedGetCapacidadeKGReturnsEmptyString {

    @Test
    public void getCapacidadeKGReturnsEmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String result = obj.getCapacidadeKG();
        assertTrue(result.isEmpty());
    }

}