package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItemAfterResourceValidation_NullOPFItem_DoesNotReturnFalse {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void checkItemAfterResourceValidation_NullOPFItem_DoesNotReturnFalse() {
        assertFalse(OPFChecker30.checkItemAfterResourceValidation(null));
    }

}