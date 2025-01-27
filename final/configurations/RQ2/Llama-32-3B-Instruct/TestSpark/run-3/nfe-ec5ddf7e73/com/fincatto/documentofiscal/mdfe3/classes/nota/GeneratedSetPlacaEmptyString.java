package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.function.Consumer;

public class GeneratedSetPlacaEmptyString {

    @Test
    public void setPlacaEmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca("");
        assertTrue(obj.getPlaca().isEmpty());
    }

}