package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.hamcrest.Matchers.is;

public class GeneratedTest {

    public Element element = new Element();

    @Test
    public void setCodigoInterno_Succeeds() {
        initMocks(this);
        assertEquals("12345", element.getCodigoInterno());
    }

    @Test
    public void setRenavam_Succeeds() {
        element.setCodigoInterno("12345");
        element.setRenavam("renavitam");
        assert (element.getRenavam().equals("renavitam"));
    }

    @Test
    public void setTara_Succeeds() {
        element.setCodigoInterno("12345");
        element.setRenavam("renavitam");
        element.setTara("tarav");
        assert (element.getTara().equals("tarav"));
    }

    @Test
    public void setCapacidadeKG_Succeeds() {
        element.setCodigoInterno("12345");
        element.setRenavam("renavitam");
        element.setTara("tarav");
        element.setCapacidade KG ("capacidadeKG");
        assert (element.getCapacidade KG().equals("capacidadeKG"));
    }

    @Test
    public void assertEquals_CodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        element.setCodigoInterno("12345");
        assert (mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno().equals("12345"));
    }

    @Test
    public void assertEquals_Renavitam() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        element.setCodigoInterno("12345");
        element.setRenavam("renavitam");
        assert (mdfInfoModalRodoviarioVeiculoReboque.getRenavam().equals("renavitam"));
    }

    @Test
    public void assertEquals_Tara() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        element.setCodigoInterno("12345");
        element.setRenavam("renavitam");
        element.setTara("tarav");
        assert (mdfInfoModalRodoviarioVeiculoReboque.getTara().equals("tarav"));
    }

    @Test
    public void assertEquals_CapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        element.setCodigoInterno("12345");
        element.setRenavam("renavitam");
        element.setTara("tarav");
        element.setCapacidade KG ("capacidadeKG");
        assert (mdfInfoModalRodoviarioVeiculoReboque.getCapacidade KG().equals("capacidadeKG"));
    }
}

class Element {
    public String getCodigoInterno();

    public String getRenavam();

    public String getTara();

    public String getCapacidade

    KG();

    public void setCodigoInterno(String codigoInterno);

    public void setRenavam(String renavitam);

    public void setTara(String tarav);

    public void setCapacidade

    KG(String capacidadeKG);

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public String getRenavam() {
        return renavitam;
    }

    public String getTara() {
        return tarav;
    }

    public String getCapacidade

    KG() {
        return capacidadeKG;
    }
}

}