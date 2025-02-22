package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetCapacidadeKG {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque;

    @Before
    public void setUp() {
        mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void testSetCapacidadeKG() {
        String capacidadeKG = "12345";
        mDFInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        Assert.assertEquals("12345", mDFInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}