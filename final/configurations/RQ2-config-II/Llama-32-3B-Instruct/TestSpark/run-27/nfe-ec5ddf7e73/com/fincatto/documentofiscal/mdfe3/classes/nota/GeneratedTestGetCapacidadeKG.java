package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetCapacidadeKG {

    @Mock
    private DFStringValidador validador;

    public void setCodigoInterno() {
        // Implementation of setCodigoInterno
    }

    public void setPlaca() {
        // Implementation of setPlaca
    }

    public void setRenavam() {
        // Implementation of setRenavam
    }

    public void setTara() {
        // Implementation of setTara
    }

    @Test
    public void testGetCapacidadeKG() {
        String capacidadeKG = "10kg";
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mdf.getCapacidadeKG());
    }

}