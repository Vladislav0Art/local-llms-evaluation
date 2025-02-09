package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetPlacaInvalido_DevolveFalso {

    @Test
    public void setPlacaInvalido_DevolveFalso() {
        String placa = "";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean resultado = mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertFalse(resultado);
    }

}