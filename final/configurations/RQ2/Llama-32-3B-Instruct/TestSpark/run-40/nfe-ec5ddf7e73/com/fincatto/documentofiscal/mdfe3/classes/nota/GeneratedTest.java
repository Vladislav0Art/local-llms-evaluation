package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    private String codigoInterno;
    private String placa;
    private String renavam;
    private String tara;
    private String capacidadeKG;
    private String capacidadeM3;

    public DocumentFiscal() {
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getTara() {
        return tara;
    }

    public String getCapacidadeKG() {
        return capacidadeKG;
    }

    public void setCapacidadeKG(String capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    public String getCapacidadeM3() {
        return capacidadeM3;
    }

    public void setCapacidadeM3(String capacidadeM3) {
        this.capacidadeM3 = capacidadeM3;
    }
}

public class DocumentFiscalTest {

    @Test
    public void testDocumentoFiscal() {
        DocumentFiscal df = new DocumentFiscal();
        df.setCodigoInterno("123456789");
        df.setPlaca("ABC123");
        df.setRenavam("123456789");
        df.setTara("123456789");
        df.setCapacidadeKG("123456789");
        df.setCapacidadeM3("123456789");

        assertEquals("123456789", df.getCodigoInterno());
        assertEquals("ABC123", df.getPlaca());
        assertEquals("123456789", df.getRenavam());
        assertEquals("123456789", df.getTara());
        assertEquals("123456789", df.getCapacidadeKG());
        assertEquals("123456789", df.getCapacidadeM3());

        df.setCapacidadeKG(null);
        df.setCapacidadeM3(null);

        assertNull(df.getCapacidadeKG());
        assertNull(df.getCapacidadeM3());
    }

}