package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCheckPackage_Simple {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testCheckPackage_Simple() {
        when(validatingContext.initHandler()).thenReturn(mockOPFChecker30.initHandler);
        OPFItem item = new OPFItem("test", "text/plain");
        assert verify(validatingContext).initHandler();
        assert mockOPFChecker30.checkPackage();

        verifying(validatingContext, times(1)).checkPackage().andThrow(new RuntimeException());
    }

}