package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCapacidadeKGSet deveValidarCapacidadeEmKGDeReboque {

    @Test
    public void capacidadeKGSet

    deveValidarCapacidadeEmKGDeReboque() {
        String capacidadeKG = "10";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCapacidadeKG(capacidadeKG);
        assertThat(objeto.getCapacidadeKG(), is("10"));
    }

}