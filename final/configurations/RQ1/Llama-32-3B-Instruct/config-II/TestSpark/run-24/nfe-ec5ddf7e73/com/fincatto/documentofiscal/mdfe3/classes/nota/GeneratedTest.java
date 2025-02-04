package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidCodigo = "abcdefg";
        mdf.setCodigoInterno(invalidCodigo);
        assertNull(mdf.getCodigoInterno());
    }

    @Test
    public void setCodigoInterno_InvalidFormat_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidPlaca = "1234567890123";
        mdf.setPlaca(invalidPlaca);
        assertEquals("ABCDEF", mdf.getCodigoInterno());
    }

    @Test
    public void setPlaca_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidPlaca = "12345678901234";
        mdf.setPlaca(invalidPlaca);
        assertEquals("1234567890123", mdf.getPlaca());
    }

    @Test
    public void setRenavam_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidRenavam = "12345678901234";
        mdf.setRenavam(invalidRenavam);
        assertEquals("1234567890123", mdf.getRenavam());
    }

    @Test
    public void setTara_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidTara = "12345678901234";
        mdf.setTara(invalidTara);
        assertEquals("12345", mdf.getTara());
    }

    @Test
    public void setCapacidadeKG_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidCapacidade = "abcdefg";
        mdf.setCapacidadeKG(invalidCapacidade);
        assertEquals("abc", mdf.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidCapacidadeM3 = "12345678901234";
        mdf.setCapacidadeM3(invalidCapacidadeM3);
        assertEquals("12", mdf.getCapacidadeM3());
    }

    @Test
    public void getCapacidadeKG_InitialValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals("", mdf.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3_InitialValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals("0", mdf.getCapacidadeM3());
    }
}

@Test
public void DFStringValidador_validador_Mockito() {
    // Arrange
    String invalidCodigoInterno = "abcdefg";
    String validCodigoInterno = "1234567890123";

    // Act
    MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
    DFStringValidador validadorMockito = Mockito.mock(DFStringValidador.class);
    when(validadorMockito.validador(invalidCodigoInterno, "Codigo interno Veiculo Reboque", 10, false, false)).thenReturn("ABCDEF");
    mdf.setCodigoInterno(invalidCodigoInterno);

    // Assert
    assertEquals("ABCDEF", mdf.getCodigoInterno());
}

}