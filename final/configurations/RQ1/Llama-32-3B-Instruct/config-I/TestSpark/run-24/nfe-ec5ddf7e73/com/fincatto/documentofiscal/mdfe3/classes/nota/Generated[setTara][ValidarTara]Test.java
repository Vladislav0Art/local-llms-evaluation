package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Calendar;

public class Generated[setTara][ValidarTara]

Test {

    @Test
    public void [setTara][ValidarTara]Test() {
        final String tara = "12345";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setTara(tara);
        assertEquals(5, object.getTara().length());
    }

}