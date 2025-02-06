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
public class GeneratedTest {

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
    public void getCapacidadeKG_ReturnsNullWhenSetToNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertNull(obj.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_SetCorrectly() {
        String capacidadeKG = "10kg";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, obj.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3_ReturnsNullWhenSetToNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertNull(obj.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_SetCorrectly() {
        String capacidadeM3 = "100m3";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, obj.getCapacidadeM3());
    }

}