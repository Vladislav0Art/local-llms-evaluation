package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

public class GeneratedSetCapacidadeKG_MaiorQue10000 {

    @Test
    public void setCapacidadeKG_MaiorQue10000() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKgMaiorQue10000 = "10001";
        assertThrows(IllegalArgumentException.class, () -> mdf.setCapacidadeKG(capacidadeKgMaiorQue10000));
    }

}