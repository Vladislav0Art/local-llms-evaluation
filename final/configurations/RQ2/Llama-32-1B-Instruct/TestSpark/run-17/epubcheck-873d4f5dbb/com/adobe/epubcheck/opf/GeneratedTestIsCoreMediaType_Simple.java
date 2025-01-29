package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestIsCoreMediaType_Simple {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testIsCoreMediaType_Simple() {
        when(validReference().getType()).thenReturn("audio/piano");
        OPFItem item = new OPFItem("test", "text/plain");
        assertEquals("test", mockOPFChecker30.getPreferredMediaType(item.getType(), "test"));
    }

}