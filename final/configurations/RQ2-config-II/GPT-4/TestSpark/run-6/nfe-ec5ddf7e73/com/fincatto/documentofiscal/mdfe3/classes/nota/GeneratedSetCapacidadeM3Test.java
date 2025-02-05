package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

import static org.junit.Assert.*;

public class GeneratedSetCapacidadeM3Test {

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeM3("1000");
        assertEquals("1000", modal.getCapacidadeM3());
    }

}