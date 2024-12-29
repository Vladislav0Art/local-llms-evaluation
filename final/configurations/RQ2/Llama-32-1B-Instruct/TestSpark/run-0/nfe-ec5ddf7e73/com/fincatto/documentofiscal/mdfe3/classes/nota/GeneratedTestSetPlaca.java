package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.simpleframework.xml.Element;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestSetPlaca {

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC123";
        mdf.setPlaca(placa);
        assertEquals(placa, mdf.getPlaca());
    }

}