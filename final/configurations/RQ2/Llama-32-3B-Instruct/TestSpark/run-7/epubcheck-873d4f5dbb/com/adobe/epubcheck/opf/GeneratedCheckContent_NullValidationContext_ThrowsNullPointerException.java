package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckContent_NullValidationContext_ThrowsNullPointerException {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void checkContent_NullValidationContext_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> OPFChecker30.checkContent(null));
    }

}