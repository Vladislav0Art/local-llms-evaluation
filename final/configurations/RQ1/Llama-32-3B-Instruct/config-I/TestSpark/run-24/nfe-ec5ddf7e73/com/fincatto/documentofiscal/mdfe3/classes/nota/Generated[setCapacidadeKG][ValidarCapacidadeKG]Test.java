package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Calendar;

public class Generated[setCapacidadeKG][ValidarCapacidadeKG]

Test {

    @Test
    public void [setCapacidadeKG][ValidarCapacidadeKG]Test() {
        final String capacidadeKG = "12345";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setCapacidadeKG(capacidadeKG);
        assertEquals(5, object.getCapacidadeKG().length());
    }

}