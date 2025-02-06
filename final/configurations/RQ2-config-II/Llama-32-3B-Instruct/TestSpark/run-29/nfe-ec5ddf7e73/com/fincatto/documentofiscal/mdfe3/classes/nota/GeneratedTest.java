package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTest {

    @Test
    public void codigoInternoSet_EmptyString_ThrowsException() {
        final String codigoInterno = "";
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno));
    }

    @Test
    public void placaSet_EmptyString_ThrowsException() {
        final String placa = "";
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa));
    }

    @Test
    public void renavamSet_EmptyString_ThrowsException() {
        final String renavam = "";
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam));
    }

    @Test
    public void taraSet_EmptyString_ThrowsException() {
        final String tara = "";
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara));
    }

    @Test
    public void capacidadeKGGet_ReturnsEmptyString() {
        final String capacidadeKG = "0";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(capacidadeKG, object.getCapacidadeKG());
    }

    @Test
    public void capacidadeKGSet_EmptyString_ThrowsException() {
        final String capacidadeKG = "";
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG));
    }
}

@Test
public void setCodigoInternoSetValidString_SetCorrectly() {
    final String codigoInterno = "123456";
    final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
    object.setCodigoInterno(codigoInterno);
    assertTrue(DFStringValidador.isValido(codigoInterno));
}

@Test
public void setPlacaSetValidString_SetCorrectly() {
    final String placa = "ABCD123";
    final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
    object.setPlaca(placa);
    assertTrue(DFStringValidador.isValido(placa));
}

@Test
public void setRenavamSetValidString_SetCorrectly() {
    final String renavam = "1234567890";
    final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
    object.setRenavam(renavam);
    assertTrue(DFStringValidador.isValido(renavam));
}

@Test
public void setTaraSetValidString_SetCorrectly() {
    final String tara = "0.00";
    final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
    object.setTara(tara);
    assertTrue(DFStringValidador.isValido(tara));
}

@Test
public void setCapacidadeKGSetValidString_SetCorrectly() {
    final String capacidadeKG = "10";
    final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
    object.setCapacidadeKG(capacidadeKG);
    assertTrue(DFStringValidador.isValido(capacidadeKG));
}

@Test
public void setCapacidadeM3SetValidString_SetCorrectly() {
    final String capacidadeM3 = "10";
    final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
    object.setCapacidadeM3(capacidadeM3);
    assertTrue(DFStringValidador.isValido(capacidadeM3));
}
	}

@Test
public void getCapacidadeKGGet_EmptyString_ReturnsEmptyString() {
    final String capacidadeKG = "";
    final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
    assertEquals(capacidadeKG, object.getCapacidadeKG());
}

}