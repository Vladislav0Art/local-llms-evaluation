package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTest {

    @Element(name = "codigos-internos")
    private String codigoInternoMocked = "mocked_codigo_interno";

    @Element(name = "placas")
    private String placaMocked = "mocked_placa";

    @Element(name = "renavams")
    private String renavamMocked = "mocked_renavam";

    @Element(name = "taras")
    private String taraMocked = "mocked_tara";

    public class MDFInfoModalRodoviarioVeiculoReboqueTest {
        private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

        @Test
        public void setCodigoInterno_Mock() {
            mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
            mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInternoMocked);
            assertEquals(mcdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno(), codigoInternoMocked);
        }

        @Test
        public void setPlaca_Mock() {
            mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
            mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placaMocked);
            assertEquals(mcdfInfoModalRodoviarioVeiculoReboque.getPlaca(), placaMocked);
        }

        @Test
        public void setRenavam_Mock() {
            mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
            mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavamMocked);
            assertEquals(mcdfInfoModalRodoviarioVeiculoReboque.getRenavam(), renavamMocked);
        }

        @Test
        public void setTara_Mock() {
            mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
            mdfInfoModalRodoviarioVeiculoReboque.setTara(taraMocked);
            assertEquals(mcdfInfoModalRodoviarioVeiculoReboque.getTara(), taraMocked);
        }

        @Test
        public void getCapacidadeKG_Mock() {
            mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
            assertEquals(mcdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG(), "");
        }

        @Test
        public void setCapacidadeKG_Mock() {
            mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
            mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("mocked_capacidade_KG");
            assertEquals(mcdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG(), "mocked_capacidade_KG");
        }

        @Test
        public void getCapacidadeM3_Mock() {
            mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
            assertEquals(mcdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3(), "");
        }

        @Test
        public void setCapacidadeM3_Mock() {
            mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
            mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("mocked_capacidade_M3");
            assertEquals(mcdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3(), "mocked_capacidade_M3");
        }
    }

    @Test
    public void testSetPlaca_Mock() {
        when(dfsValidador.validarString(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(mockPlaca);
        assertTrue(dfStringValidador.isOk());
    }

    @Test
    public void testGetCapacidadeM3_Mock() {
        when(mcf.getCapacidadeM3(anyString())).thenReturn("mocked_capacidade_M3");
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(mockPlaca);
        assertEquals(mcdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3(), mockPlaca);
    }
}

}