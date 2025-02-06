package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedSetPlaca_CampoDePlacaNãoPreenchido {

    @Test
    public void setPlaca_CampoDePlacaNãoPreenchido() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placaMocked = Mockito.mock(String.class);
        when(obj.setPlaca(placaMocked)).thenReturn(obj);
        assertEquals("ABC123", obj.getPlaca());
    }

}