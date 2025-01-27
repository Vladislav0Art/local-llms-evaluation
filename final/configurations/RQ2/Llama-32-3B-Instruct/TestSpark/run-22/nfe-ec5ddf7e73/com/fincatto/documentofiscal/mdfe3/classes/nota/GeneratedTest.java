package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    public String setCodigoInterno(String cod) {
        return "";
    }

    public String setRenavam(String renavam) {
        return "Invalid format";
    }

    public String setTara(Object tara) {
        return "Invalid value";
    }
}

package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import static org.junit.Assert .*;
        import java.util.HashMap;
import java.util.Map;

public class MDFInfoModalRodoviarioVeiculoReboqueTest {

    @Test
    public void setCodigoInternoEmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCodigoInterno("");
        assertFalse(modal.getCodigoInterno().isEmpty());
    }

    @Test
    public void setPlacaEmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setPlaca("");
        assertFalse(modal.getPlaca().isEmpty());
    }

    @Test
    public void setRenavamEmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setRenavam("");
        assertFalse(modal.getRenavam().isEmpty());
    }

    @Test
    public void setTaraEmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setTara("");
        assertFalse(modal.getTara().isEmpty());
    }

    @Test
    public void getCapacidadeKGInvalidValue() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals("Invalid capacity", modal.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKGValidValue() {
        String value = "10";
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeKG(value);
        assertEquals(value, modal.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3InvalidValue() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals("Invalid capacity", modal.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3ValidValue() {
        String value = "10";
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeM3(value);
        assertEquals(value, modal.getCapacidadeM3());
    }

}