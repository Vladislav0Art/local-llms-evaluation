package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedRenavamSet deveValidarRenavamDeReboque {

    @Test
    public void renavamSet

    deveValidarRenavamDeReboque() {
        String renavam = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setRenavam(renavam);
        assertThat(objeto.getRenavam(), is("123456789"));
    }

}