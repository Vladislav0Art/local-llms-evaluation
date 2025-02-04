package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedTaraSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia {

    @Test
    public void taraSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia() {
        final String tara = "00000";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertEquals("00000", new MDFInfoModalRodoviarioVeiculoReboque().getTara());
    }

}