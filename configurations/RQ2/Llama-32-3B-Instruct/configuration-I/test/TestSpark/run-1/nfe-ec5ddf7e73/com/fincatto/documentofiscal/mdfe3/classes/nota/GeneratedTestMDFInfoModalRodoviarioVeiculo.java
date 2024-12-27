package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.MDFInfoModalRodoviarioVeiculoReboque;
import com.fincatto.documentofiscal.mdfe3.classes.MDFInfoModalRodoviarioVeiculo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Optional;

public class GeneratedTestMDFInfoModalRodoviarioVeiculo {

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
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

public class GeneratedTest {

    @Test
    public void testMDFInfoModalRodoviarioVeiculo() {
        MDFInfoModalRodoviarioVeiculo object = new MDFInfoModalRodoviarioVeiculo();
        object.setCodigo("TEST");
        assertEquals("TEST", object.getCodigo());
    }

}