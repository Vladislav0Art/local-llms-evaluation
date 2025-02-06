package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.simpleframework.xml.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCapacidadeKG_SetCorrectly {

    @Mock
    private DFStringValidador validador;

    public void setCodigoInterno(String codigoInterno) {
        // implementation
    }

    public void setPlaca(String placa) {
        // implementation
    }

    public void setRenavam(String renavam) {
        // implementation
    }

    public void setTara(String tara) {
        // implementation
    }

    @Test
    public void setCapacidadeKG_SetCorrectly() {
        String capacidadeKG = "10kg";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, obj.getCapacidadeKG());
    }

}