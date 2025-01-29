package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestIsBlessedFontType_Simple {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testIsBlessedFontType_Simple() {
        when(validReference().getType()).thenReturn("blessed-font/TTF");
        OPFItem item = new OPFItem("test", "text/plain");
        assertTrue(mockOPFChecker30.isBlessedFontType(item.getType()));
    }

}