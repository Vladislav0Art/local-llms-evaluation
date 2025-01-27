package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_NullIsAllowed() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCodigoInterno(null);
        assertNull(mdf.getCodigoInterno());
    }

    @Test
    public void setPlaca_NullIsAllowed() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setPlaca(null);
        assertNull(mdf.getPlaca());
    }

    @Test
    public void setRenavam_NullIsAllowed() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam(null);
        assertNull(mdf.getRenavam());
    }

    @Test
    public void setTara_NullIsAllowed() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setTara(null);
        assertNull(mdf.getTara());
    }

    @Test
    public void getCapacidadeKG_NullIsAllowed() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(null);
        assertNull(mdf.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_InvalidValue_ThrowsException() {
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG("invalid"));
    }

}