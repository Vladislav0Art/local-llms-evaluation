package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedPlacaSet deveValidarPlacaDeReboque {

    @Test
    public void placaSet

    deveValidarPlacaDeReboque() {
        String placa = "AAA-BAH";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setPlaca(placa);
        assertThat(objeto.getPlaca(), is("AAA-BAH"));
    }

}