package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCoreMediaType_ValidatesCoreMediaFormat {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void isCoreMediaType_ValidatesCoreMediaFormat() {
        String type = "text/coremedia";
        assertTrue(OPFChecker30.isCoreMediaType(type));
    }

}