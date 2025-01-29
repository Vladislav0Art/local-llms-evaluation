package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class GeneratedTest {

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

    @Test
    public void testSetCapacidadeKG() {
        assertEquals("", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("mno");
    }

    @Test
    public void testGetCapacidadeM3() {
        assertEquals("", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("pqr");
    }

    @Test
    public void testSetCapacidadeM3() {
        assertEquals("", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("sux");
    }

}