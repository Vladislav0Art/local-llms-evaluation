package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCoreMediaType_NonCoreMediaType_ReturnsFalse {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void isCoreMediaType_NonCoreMediaType_ReturnsFalse() {
        assertFalse(OPFChecker30.isCoreMediaType("text"));
    }

}