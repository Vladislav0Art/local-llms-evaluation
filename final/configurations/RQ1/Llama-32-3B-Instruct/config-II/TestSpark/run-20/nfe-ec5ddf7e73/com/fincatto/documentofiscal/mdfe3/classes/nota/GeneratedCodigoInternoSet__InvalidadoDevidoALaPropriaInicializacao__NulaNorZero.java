package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedCodigoInternoSet__InvalidadoDevidoALaPropriaInicializacao__NulaNorZero {

    @Test
    public void codigoInternoSet__InvalidadoDevidoALaPropriaInicializacao__NulaNorZero() {
        final String codigoInterno = "00000000000";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertNull(new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

}