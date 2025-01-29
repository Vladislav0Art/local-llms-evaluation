package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCheckPackage_Blessed {

    @Mock
    private ValidatingContext validatingContext;

    @Mock
    private MockOPFChecker30 mockOPFChecker30;

    @Test
    public void testCheckPackage_Blessed() {
        when(validatingContext.initHandler()).thenReturn(mockOPFChecker30.initHandler);
        OPFItem item = new OPFItem("test", "blessed-text/plain");
        assert verify(validatingContext).initHandler();
        assert mockOPFChecker30.checkPackage();

        verifying(validatingContext, times(1)).checkPackage().andThrow(new RuntimeException());
    }

}