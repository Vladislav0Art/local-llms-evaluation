package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class GeneratedTestSetRenavam {

    @Mock
    private Element element;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    public static class TestElement {
        public String getCodigoInterno() {
            return "test";
        }

        public void setCodigoInterno(final String codigoInterno) {
            this.codigoInterno = codigoInterno;
        }

        public String getPlaca() {
            return "test";
        }

        public void setPlaca(final String placa) {
            this.placa = placa;
        }

        public String getRenavam() {
            return "test";
        }

        public void setRenavam(final String renavam) {
            this.renavam = renavam;
        }

        public String getTara() {
            return "test";
        }

        public String getCapacidadeKG() {
            return "test";
        }

        public void setCapacidadeKG(final String capacidadeKG) {
            this.capacidadeKG = capacidadeKG;
        }

        public String getCapacidadeM3() {
            return "test";
        }

        public void setCapacidadeM3(final String capacidadeM3) {
            this.capacidadeM3 = capacidadeM3;
        }
    }

    @Test
    public void testSetRenavam() {
        TestElement elementMock = new TestElement();
        element.set("renavam", "test");
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(elementMock.getRenavam());
        assertEquals("test", mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}