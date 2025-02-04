package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_InvalidValue_ThrowsNullPointerException() {
        final String codigoInterno = "12345";
        final Exception exception = assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno));
        assertEquals("Codigo interno Veiculo Reboque", exception.getMessage());
    }

    @Test
    public void setPlaca_InvalidPlaca_ThrowsNullPointerException() {
        final String placa = "A";
        final Exception exception = assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa));
        assertEquals("Placa do reboque", exception.getMessage());
    }

    @Test
    public void setRenavam_InvalidIntervalo_ThrowsNullPointerException() {
        final String renavam = "12345";
        final Exception exception = assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam));
        assertEquals("Renavam do reboque", exception.getMessage());
    }

    @Test
    public void setTara_InvalidTara_ThrowsNullPointerException() {
        final String tara = "A";
        final Exception exception = assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara));
        assertEquals("Tara em reboque", exception.getMessage());
    }

    @Test
    public void setCapacidadeKG_ValidValue() {
        final String capacidadeKG = "500";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals(500, Integer.parseInt(new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG()));
    }

    @Test
    public void setCapacidadeM3_ValidValue() {
        final String capacidadeM3 = "100";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals(100, Integer.parseInt(new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3()));
    }

    @Test
    public void getCapacidadeKG_ValidValue() {
        final String capacidadeKG = "500";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals(500, Integer.parseInt(new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG()));
    }

    @Test
    public void getCapacidadeM3_ValidValue() {
        final String capacidadeM3 = "100";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals(100, Integer.parseInt(new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3()));
    }
}

}