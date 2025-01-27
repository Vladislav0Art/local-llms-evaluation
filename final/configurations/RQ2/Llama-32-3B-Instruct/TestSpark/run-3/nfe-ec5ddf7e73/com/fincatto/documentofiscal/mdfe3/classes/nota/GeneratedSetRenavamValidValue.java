package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.function.Consumer;

public class GeneratedSetRenavamValidValue {

    @Test
    public void setRenavamValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "1234567890";
        obj.setRenavam(renavam);
        assertEquals(renavam, obj.getRenavam());
    }

}