package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.MDFInfoModalRodoviarioVeiculoReboque;
import com.fincatto.documentofiscal.mdfe3.classes.MDFInfoModalRodoviarioVeiculo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Optional;

public class GeneratedGetRenavamTest {

    private String codigoInterno;
    private String placa;
    private String renavam;
    private String tara;
    private Double capacidadeKG;

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public Double getCapacidadeKG() {
        return capacidadeKG;
    }

    public void setCapacidadeKG(Double capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }
}

public class MDFInfoModalRodoviarioVeiculo {
    private String codigoInterno;
    private String placa;
    private String renavam;
    private String tara;

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }
}

public class GeneratedTest {

    @Test
    public void getRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setRenavam("TEST");
        assertEquals("TEST", object.getRenavam());
    }

}