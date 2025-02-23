package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetRenavamTest {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mockedMDFInfoModalRodoviarioVeiculoReboque;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque testClass;

    @Test
    public void setRenavamTest() {
        String renavam = "12345678910";
        testClass.setRenavam(renavam);
        assertEquals(renavam, testClass.getRenavam());
    }

}