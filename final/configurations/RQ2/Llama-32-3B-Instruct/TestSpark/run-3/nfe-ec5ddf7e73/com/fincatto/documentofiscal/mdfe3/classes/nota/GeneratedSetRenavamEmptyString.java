package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.function.Consumer;

public class GeneratedSetRenavamEmptyString {

    @Test
    public void setRenavamEmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam("");
        assertTrue(obj.getRenavam().isEmpty());
    }

}