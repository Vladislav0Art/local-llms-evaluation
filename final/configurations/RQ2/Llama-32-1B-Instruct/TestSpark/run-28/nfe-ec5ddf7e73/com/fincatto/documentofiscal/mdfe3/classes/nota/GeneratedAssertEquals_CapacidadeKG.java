package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.hamcrest.Matchers.is;

public class GeneratedAssertEquals_CapacidadeKG {

    public Element element = new Element();

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