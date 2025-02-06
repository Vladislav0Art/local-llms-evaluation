package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedSetCapacidadeM3SetValidString_SetCorrectly {

    @Test
    public void setCapacidadeM3SetValidString_SetCorrectly() {
        final String capacidadeM3 = "10";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setCapacidadeM3(capacidadeM3);
        assertTrue(DFStringValidador.isValido(capacidadeM3));
    }
}

}