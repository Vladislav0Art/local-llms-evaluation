package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

public class GeneratedSetRenavam {

    public String getCapacidadeKG() {
        return "100";
    }

    public void setCapacidadeKG(String expected) {
        this.capacidadeKG = expected;
    }

    public String getPlaca() {
        return "abc";
    }

    public void setPlaca(String expected) {
        this.placa = expected;
    }

    public String getRenavam() {
        return "abc";
    }

    public void setRenavam(String expected) {
        this.renavam = expected;
    }

    public String getTara() {
        return "abc";
    }

    public void setTara(String expected) {
        this.tara = expected;
    }
}

@Test
public void setRenavam() {
    MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    mdfInfoModalRodoviarioVeiculoReboque.setRenavam("abc");
}

}