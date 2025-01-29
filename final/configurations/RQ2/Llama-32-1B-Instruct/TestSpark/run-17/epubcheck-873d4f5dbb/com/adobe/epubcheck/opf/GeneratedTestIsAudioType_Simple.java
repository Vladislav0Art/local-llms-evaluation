package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestIsAudioType_Simple {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testIsAudioType_Simple() {
        when(validReference().getType()).thenReturn("audio/plain");
        OPFItem item = new OPFItem("test", "text/plain");
        assertTrue(mockOPFChecker30.isAudioType(item.getType()));
    }

}