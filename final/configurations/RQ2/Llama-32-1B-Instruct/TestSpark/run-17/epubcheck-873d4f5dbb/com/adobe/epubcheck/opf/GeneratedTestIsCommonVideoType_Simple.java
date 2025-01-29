package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestIsCommonVideoType_Simple {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testIsCommonVideoType_Simple() {
        when(validReference().getType()).thenReturn("video/mp4");
        OPFItem item = new OPFItem("test", "text/plain");
        assertTrue(mockOPFChecker30.isFileReference(item));
    }

}