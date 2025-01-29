package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class GeneratedTestSetCapacidadeM3 {

    @Before
    public void setup() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    testSetCodigoInterno()
            throws Exception;

    testSetPlaca()
            throws Exception;

    testSetRenavam()
            throws Exception;

    testSetTara()
            throws Exception;

    @Test
    public void testSetCapacidadeM3() {
        assertEquals("", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("sux");
    }

}