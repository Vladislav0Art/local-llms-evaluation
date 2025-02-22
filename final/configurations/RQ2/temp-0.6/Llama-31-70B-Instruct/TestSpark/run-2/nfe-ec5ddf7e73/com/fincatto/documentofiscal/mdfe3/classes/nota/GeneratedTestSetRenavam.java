package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetRenavam {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque;

    @Before
    public void setUp() {
        mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void testSetRenavam() {
        String renavam = "123456789";
        mDFInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        Assert.assertEquals("123456789", mDFInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}