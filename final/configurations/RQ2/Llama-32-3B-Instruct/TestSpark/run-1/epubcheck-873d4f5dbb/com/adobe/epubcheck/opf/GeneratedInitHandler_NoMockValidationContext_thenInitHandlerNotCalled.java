package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedInitHandler_NoMockValidationContext_thenInitHandlerNotCalled {

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
    public void initHandler_NoMockValidationContext_thenInitHandlerNotCalled() {
        // given
        opfChecker30.setValidationContext(null);

        // when
        opfChecker30.initHandler();

        // then
        Mockito.verify(opfChecker30.getValidationContext(), Mockito.times(0), Mockito.any(Comparator.class));
    }

}