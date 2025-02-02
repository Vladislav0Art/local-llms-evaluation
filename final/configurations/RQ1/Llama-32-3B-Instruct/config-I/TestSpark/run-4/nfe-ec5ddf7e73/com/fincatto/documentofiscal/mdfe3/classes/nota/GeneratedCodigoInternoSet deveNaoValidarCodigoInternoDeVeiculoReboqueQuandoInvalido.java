package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCodigoInternoSet deveNaoValidarCodigoInternoDeVeiculoReboqueQuandoInvalido {

    @Test
    public void codigoInternoSet

    deveNaoValidarCodigoInternoDeVeiculoReboqueQuandoInvalido() {
        String codigoInterno = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCodigoInterno(codigoInterno);
        assertThat(objeto.getCodigoInterno(), is("123456789012"));
    }

}