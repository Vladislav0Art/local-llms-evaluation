package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "1234567890";
        reboque.setCodigoInterno(codigoInterno);
        assertEquals(reboque.getCodigoInterno(), codigoInterno);
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC1234";
        reboque.setPlaca(placa);
        assertEquals(reboque.getPlaca(), placa);
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        reboque.setRenavam(renavam);
        assertEquals(reboque.getRenavam(), renavam);
    }

}