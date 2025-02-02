package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCapacidadeM3Set deveValidarCapacidadeEmM3DeReboque {

    @Test
    public void capacidadeM3Set

    deveValidarCapacidadeEmM3DeReboque() {
        String capacidadeM3 = "2";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCapacidadeM3(capacidadeM3);
        assertThat(objeto.getCapacidadeM3(), is("2"));
    }

}