package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedRenavamSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia {

    @Test
    public void renavamSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia() {
        final String renavam = "111234";
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam);
        assertEquals("111234", new MDFInfoModalRodoviarioVeiculoReboque().getRenavam());
    }

}