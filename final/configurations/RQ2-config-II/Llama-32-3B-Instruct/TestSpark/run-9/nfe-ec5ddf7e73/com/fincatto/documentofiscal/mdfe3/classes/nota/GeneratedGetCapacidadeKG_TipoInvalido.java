package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

public class GeneratedGetCapacidadeKG_TipoInvalido {

    @Test
    public void getCapacidadeKG_TipoInvalido() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG("X");
        assertTrue(mdf.getCapacidadeKG().matches("\\d{3}"));
    }

}