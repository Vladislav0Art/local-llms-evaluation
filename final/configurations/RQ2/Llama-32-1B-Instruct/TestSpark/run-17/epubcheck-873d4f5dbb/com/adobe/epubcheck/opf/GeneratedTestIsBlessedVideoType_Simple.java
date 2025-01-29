package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestIsBlessedVideoType_Simple {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testIsBlessedVideoType_Simple() {
        when(validReference().getType()).thenReturn("blessed-text/plain");
        OPFItem item = new OPFItem("test", "text/plain");
        assertTrue(mockOPFChecker30.isBlessedVideoType(item.getType()));
    }

}