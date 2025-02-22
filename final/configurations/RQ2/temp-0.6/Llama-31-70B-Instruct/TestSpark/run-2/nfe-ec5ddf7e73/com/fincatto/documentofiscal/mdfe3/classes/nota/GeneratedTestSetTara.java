package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetTara {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque;

    @Before
    public void setUp() {
        mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void testSetTara() {
        String tara = "12345";
        mDFInfoModalRodoviarioVeiculoReboque.setTara(tara);
        Assert.assertEquals("12345", mDFInfoModalRodoviarioVeiculoReboque.getTara());
    }

}