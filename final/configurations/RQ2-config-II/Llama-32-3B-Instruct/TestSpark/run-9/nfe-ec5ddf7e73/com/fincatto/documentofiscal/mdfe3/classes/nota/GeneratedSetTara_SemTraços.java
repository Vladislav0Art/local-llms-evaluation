package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

public class GeneratedSetTara_SemTraços {

    @Test
    public void setTara_SemTraços() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraSemTraços = "00000";
        mdf.setTara(taraSemTraços);
        assertTrue(mdf.getTara().matches("\\d{5}"));
    }

}