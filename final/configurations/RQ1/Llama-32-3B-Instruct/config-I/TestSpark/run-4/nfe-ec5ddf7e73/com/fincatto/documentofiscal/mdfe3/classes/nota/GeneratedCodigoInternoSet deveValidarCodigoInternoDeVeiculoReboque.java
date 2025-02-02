package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCodigoInternoSet deveValidarCodigoInternoDeVeiculoReboque {

    @Test
    public void codigoInternoSet

    deveValidarCodigoInternoDeVeiculoReboque() {
        String codigoInterno = "123456789012";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCodigoInterno(codigoInterno);
        assertThat(objeto.getCodigoInterno(), is("123456789012"));
    }

}