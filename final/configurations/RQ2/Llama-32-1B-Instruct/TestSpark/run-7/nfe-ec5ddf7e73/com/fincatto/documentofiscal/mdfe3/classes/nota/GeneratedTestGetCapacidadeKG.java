package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class GeneratedTestGetCapacidadeKG {

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
    public void testGetCapacidadeKG() {
        assertEquals("", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("jkl");
    }

}