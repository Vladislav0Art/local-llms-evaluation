package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetRenavam {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testSetRenavam() {
        String renavam = "123456789";
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
    }

}