package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTest {

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque instance;

    @Mock
    private DFStringValidador dfStringValidador;

    @Test
    public void testSetCodigoInterno() {
        String codigoInterno = "12345";
        instance.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, instance.getCodigoInterno());
    }

    @Test
    public void testSetPlaca() {
        String placa = "ABC123";
        instance.setPlaca(placa);
        assertEquals(placa, instance.getPlaca());
    }

    @Test
    public void testSetRenavam() {
        String renavam = "DEF456";
        instance.setRenavam(renavam);
        assertEquals(renavam, instance.getRenavam());
    }

    @Test
    public void testSetTara() {
        String tara = "GHI789";
        instance.setTara(tara);
        assertEquals(tara, instance.getTara());
    }

    @Test
    public void testGetCapacidadeKG() {
        String capacidadeKG = "12345";
        instance.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeKG() throws Exception {
        String capacidadeKG = "67890";
        instance.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

    @Test
    public void testGetCapacidadeM3() {
        String capacidadeM3 = "12345";
        instance.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, instance.getCapacidadeM3());
    }

    @Test
    public void testSetCapacidadeM3() throws Exception {
        String capacidadeM3 = "67890";
        instance.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, instance.getCapacidadeM3());
    }

}