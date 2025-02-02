package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedTaraSet deveValidarTaraDeReboque {

    @Test
    public void taraSet

    deveValidarTaraDeReboque() {
        String tara = "100";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setTara(tara);
        assertThat(objeto.getTara(), is("100"));
    }

}