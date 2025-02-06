package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedSetPlacaSetValidString_SetCorrectly {

    @Test
    public void setPlacaSetValidString_SetCorrectly() {
        final String placa = "ABCD123";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setPlaca(placa);
        assertTrue(DFStringValidador.isValido(placa));
    }

}