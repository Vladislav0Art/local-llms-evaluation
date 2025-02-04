package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedCodigoInternoSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorZero {

    @Test
    public void codigoInternoSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorZero() {
        final String codigoInterno = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertEquals("1234567890", new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

}