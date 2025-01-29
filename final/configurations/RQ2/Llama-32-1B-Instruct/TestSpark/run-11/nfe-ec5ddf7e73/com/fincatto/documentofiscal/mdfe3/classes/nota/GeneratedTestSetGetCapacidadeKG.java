package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class GeneratedTestSetGetCapacidadeKG {

    @ParameterizedTest
    @CsvSource({
            "CIC",
            "MOT"
    })
    public void testSetCodigoInterno(final String codigoInterno) {
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        model.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, model.getCodigoInterno());
    }

    @ParameterizedTest
    @CsvSource({
            "PLA_123456789",
            "PLA_9876543210"
    })
    public void testSetPlaca(final String placa) {
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        model.setPlaca(placa);
        assertEquals(placa, model.getPlaca());
    }

    @ParameterizedTest
    @CsvSource({
            "REN_123456",
            "REN_901234"
    })
    public void testSetRenavam(final String renavam) {
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        model.setRenavam(renavam);
        assertEquals(renavam, model.getRenavam());
    }

    @ParameterizedTest
    @CsvSource({
            "TAR_123456",
            "TAR_901234"
    })
    public void testSetTara(final String tara) {
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        model.setTara(tara);
        assertEquals(tara, model.getTara());
    }

    @Test
    public void testSetGetCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidade KG = "500";
        model.setCapacidadeKG(capacidade KG);
        assertEquals(500, model.getCapacidadeKG());
    }

}