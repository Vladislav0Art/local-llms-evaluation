package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetTaraMocked {

    @Test
    public void setTaraMocked() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "ABC123";
        DFStringValidador validador = mock(DFStringValidador.class);
        when(validador.isValid(tara)).thenReturn(true);
        modal.setTara(tara, validador);
        assertEquals(tara, modal.getTara());
    }

}