package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.simpleframework.xml.Element;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestSetTara {

    @Test
    public void testSetTara() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "GHI789";
        mdf.setTara(tara);
        assertEquals(tara, mdf.getTara());
    }

}