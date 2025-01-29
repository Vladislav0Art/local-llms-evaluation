package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestIsBlessedScriptType_Simple {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testIsBlessedScriptType_Simple() {
        when(validReference().getType()).thenReturn("application/x-font");
        OPFItem item = new OPFItem("test", "text/plain");
        assertTrue(mockOPFChecker30.isBlessedScriptType(item.getType()));
    }

}