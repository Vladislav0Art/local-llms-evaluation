package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.function.Consumer;

public class GeneratedSetTaraValidValue {

    @Test
    public void setTaraValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "1000";
        obj.setTara(tara);
        assertEquals(tara, obj.getTara());
    }

}