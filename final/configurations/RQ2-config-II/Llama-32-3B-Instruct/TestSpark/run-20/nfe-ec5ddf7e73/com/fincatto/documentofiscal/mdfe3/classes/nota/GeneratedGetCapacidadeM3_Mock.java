package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedGetCapacidadeM3_Mock {

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
        public void getCapacidadeM3_Mock() {
            mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
            assertEquals(mcdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3(), "");
        }

    }