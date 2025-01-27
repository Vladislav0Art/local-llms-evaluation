package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.function.Consumer;

public class GeneratedSetCodigoInternoValidValue {

    @Test
    public void setCodigoInternoValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String code = "1234";
        obj.setCodigoInterno(code);
        assertEquals(code, obj.getCodigoInterno());
    }

}