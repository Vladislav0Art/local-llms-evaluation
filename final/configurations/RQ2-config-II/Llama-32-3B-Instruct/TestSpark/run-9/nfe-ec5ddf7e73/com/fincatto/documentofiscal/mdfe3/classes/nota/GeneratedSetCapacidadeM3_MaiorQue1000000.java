package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

public class GeneratedSetCapacidadeM3_MaiorQue1000000 {

    @Test
    public void setCapacidadeM3_MaiorQue1000000() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3MaiorQue1000000 = "1000001";
        assertThrows(IllegalArgumentException.class, () -> mdf.setCapacidadeM3(capacidadeM3MaiorQue1000000));
    }

}