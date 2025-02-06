package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

public class GeneratedSetPlaca_SemTraços {

    @Test
    public void setPlaca_SemTraços() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String placaSemTraços = "ABCDEF";
        mdf.setPlaca(placaSemTraços);
        assertTrue(mdf.getPlaca().matches("[A-Z]{6}"));
    }

}