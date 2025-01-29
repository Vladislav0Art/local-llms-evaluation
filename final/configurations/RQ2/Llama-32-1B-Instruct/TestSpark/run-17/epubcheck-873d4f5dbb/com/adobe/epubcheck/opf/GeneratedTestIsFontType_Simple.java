package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestIsFontType_Simple {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testIsFontType_Simple() {
        when(validReference().getType()).thenReturn("font/TTF");
        OPFItem item = new OPFItem("test", "text/plain");
        assertTrue(mockOPFChecker30.isFileReference(item));
    }

}