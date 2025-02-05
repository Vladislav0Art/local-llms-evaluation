package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedVideoTypeTest {


    @Mock
    private ValidationContext mockValidationContext;

    @Mock
    private OPFItem mockOPFItem;

    @Mock
    private OPFHandler mockOPFHandler;

    @Test
    public void isBlessedVideoTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/x-msvideo"));
    }

}