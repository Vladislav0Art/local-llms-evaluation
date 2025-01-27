package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.function.Consumer;

public class GeneratedSetPlacaValidValue {

    @Test
    public void setPlacaValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String plate = "ABC123";
        obj.setPlaca(plate);
        assertEquals(plate, obj.getPlaca());
    }

}