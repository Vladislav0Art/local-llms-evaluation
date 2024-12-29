package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.simpleframework.xml.Element;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestSetCapacidadeKG {

    @Test
    public void testSetCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "MNO234";
        mdf.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mdf.getCapacidadeKG());
    }

}