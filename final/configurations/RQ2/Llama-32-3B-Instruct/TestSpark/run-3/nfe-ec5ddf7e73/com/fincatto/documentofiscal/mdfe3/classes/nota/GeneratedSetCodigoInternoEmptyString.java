package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.function.Consumer;

public class GeneratedSetCodigoInternoEmptyString {

    @Test
    public void setCodigoInternoEmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno("");
        assertTrue(obj.getCodigoInterno().isEmpty());
    }

}