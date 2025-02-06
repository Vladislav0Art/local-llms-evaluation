package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

@RunWith(org.junit4.JUnit4ClassRunner.class)
public class GeneratedTest {

    @Mock
    private DFStringValidador stringValidador;

    public static final String CODIGO_INTERNO = UUID.randomUUID().toString();
    public static final String PLACA = UUID.randomUUID().toString();
    public static final String RENAVAM = UUID.randomUUID().toString();
    public static final String TARA = UUID.randomUUID().toString();

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInternoValidadoTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(CODIGO_INTERNO);
        Mockito.verify(stringValidador).isValid(CODIGO_INTERNO);
    }

    @Test
    public void setPlacaValidadoTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(PLACA);
        Mockito.verify(stringValidador).isValid(PLACA);
    }

    @Test
    public void setRenavamValidadoTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(RENAVAM);
        Mockito.verify(stringValidador).isValid(RENAVAM);
    }

    @Test
    public void setTaraValidadoTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setTara(TARA);
        Mockito.verify(stringValidador).isValid(TARA);
    }

    @Test
    public void getCapacidadeKGTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("10kg");
        assertEquals("10kg", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKGTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("20kg");
        assertEquals("20kg", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3Test() {
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("10m3");
        assertEquals("10m3", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3Test() {
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("30m3");
        assertEquals("30m3", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

    @Test
    public void setCodigoInternoInvalidoTest() {
        try {
            mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("invalid");
            assert false;
        } catch (Exception e) {
        }
    }

    @Test
    public void setPlacaInvalidoTest() {
        try {
            mdfInfoModalRodoviarioVeiculoReboque.setPlaca("invalid");
            assert false;
        } catch (Exception e) {
        }
    }

    @Test
    public void setRenavamInvalidoTest() {
        try {
            mdfInfoModalRodoviarioVeiculoReboque.setRenavam("invalid");
            assert false;
        } catch (Exception e) {
        }
    }

    @Test
    public void setTaraInvalidoTest() {
        try {
            mdfInfoModalRodoviarioVeiculoReboque.setTara("invalid");
            assert false;
        } catch (Exception e) {
        }
    }

}