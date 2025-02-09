package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetTaraInvalido_DevolveFalso {

    @Test
    public void setTaraInvalido_DevolveFalso() {
        String tara = "";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean resultado = mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertFalse(resultado);
    }

}