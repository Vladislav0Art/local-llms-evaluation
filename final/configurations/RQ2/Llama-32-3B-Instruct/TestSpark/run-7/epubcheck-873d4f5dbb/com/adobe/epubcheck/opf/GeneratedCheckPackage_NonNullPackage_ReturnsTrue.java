package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckPackage_NonNullPackage_ReturnsTrue {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void checkPackage_NonNullPackage_ReturnsTrue() {
        boolean result = OPFChecker30.checkPackage(context);
        assertTrue(result);
    }

}