package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestIsVideoType_Simple {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testIsVideoType_Simple() {
        when(validReference().getType()).thenReturn("video/mp4");
        OPFItem item = new OPFItem("test", "text/plain");
        assertTrue(mockOPFChecker30.isVideoType(item.getType()));
    }

}