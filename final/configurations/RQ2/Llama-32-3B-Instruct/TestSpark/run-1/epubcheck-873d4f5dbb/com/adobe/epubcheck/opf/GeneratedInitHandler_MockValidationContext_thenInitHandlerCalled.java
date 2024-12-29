package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedInitHandler_MockValidationContext_thenInitHandlerCalled {

    OPFChecker30 .class,OPFItem .class
})

public class OPFChecker30Test {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private URL url;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void initHandler_MockValidationContext_thenInitHandlerCalled() {
        // given
        when(validationContext.getClass()).thenReturn(OPFChecker30.class);

        // when
        opfChecker30.initHandler();

        // then
        Mockito.verify(validationContext, Mockito.times(1)).initHandler();
    }

}