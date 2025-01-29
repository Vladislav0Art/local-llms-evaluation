package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestIsBlessedAudioType_Simple {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testIsBlessedAudioType_Simple() {
        when(validReference().getType()).thenReturn("blessed-text/plain");
        OPFItem item = new OPFItem("test", "text/plain");
        assertTrue(mockOPFChecker30.isBlessedAudioType(item.getType()));
    }

}