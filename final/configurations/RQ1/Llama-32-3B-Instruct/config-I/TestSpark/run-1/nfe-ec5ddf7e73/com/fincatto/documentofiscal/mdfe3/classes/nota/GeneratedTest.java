package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class GeneratedTest {

    @Element(name = "capKG")
    private String capacidadeKGMock = Mockito.mock(String.class);

    public void setCapacidadeKg(final String capacidadeKG) {
        capacidadeKGMock = capacidadeKG;
    }

    @Test
    public void [setCodigoInterno][Validador]

    Test() {
        final String codigoInterno = "12345678901";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertNotNull(DFStringValidador.validador(codigoInterno, "Codigo interno Veiculo Reboque", 10, false, false));
    }

    @Test
    public void [setPlaca][Invalid]

    Test() {
        final String placa = "";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertTrue(DFStringValidador.placaDeVeiculo(placa, "Placa do reboque"));
    }

    @Test
    public void [setRenavam][Intervalo]

    Test() {
        final String renavam = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertTrue(DFStringValidador.validaIntervalo(renavam, 9, 11, "Renavam do reboque"));
    }

    @Test
    public void [setTara][Limites]

    Test() {
        final String tara = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertEquals(5, DFStringValidador.capacidadeNDigitos(tara, "Tara em reboque", 5));
    }

    @Test
    public void [setCapacidadeKG][Limites]

    Test() {
        final String capacidadeKg = "123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKg);
        assertEquals(5, DFStringValidador.capacidadeNDigitos(capacidadeKg, "Capacidade em KG reboque", 5));
    }

    @Test
    public void [setCapacidadeM3][Limites]

    Test() {
        final String capacidadeM3 = "123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals(2, DFStringValidador.capacidadeNDigitos(capacidadeM3, "Capacidade em M3 reboque", 2));
    }

}