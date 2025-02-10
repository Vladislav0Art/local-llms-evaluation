package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCoreMediaType_coreMedia {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void isCoreMediaType_coreMedia() {
        String type = "core media";

        // When and Then
        boolean result = OPFChecker30.isCoreMediaType(type);
        assertTrue(result);
    }

}