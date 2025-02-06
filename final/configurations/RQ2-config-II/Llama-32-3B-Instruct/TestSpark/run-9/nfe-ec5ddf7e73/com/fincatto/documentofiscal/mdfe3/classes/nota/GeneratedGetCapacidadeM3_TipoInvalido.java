package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

public class GeneratedGetCapacidadeM3_TipoInvalido {

    @Test
    public void getCapacidadeM3_TipoInvalido() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3("X");
        assertTrue(mdf.getCapacidadeM3().matches("\\d{6}"));
    }

}