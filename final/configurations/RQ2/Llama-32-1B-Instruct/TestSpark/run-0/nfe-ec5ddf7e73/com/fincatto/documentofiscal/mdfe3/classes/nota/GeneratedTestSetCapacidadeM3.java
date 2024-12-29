package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.simpleframework.xml.Element;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestSetCapacidadeM3 {

    @Test
    public void testSetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "STU890";
        mdf.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdf.getCapacidadeM3());
    }

}