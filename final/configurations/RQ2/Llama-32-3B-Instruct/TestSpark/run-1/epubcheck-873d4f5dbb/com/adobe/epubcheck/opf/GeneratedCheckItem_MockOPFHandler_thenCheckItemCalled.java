package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedCheckItem_MockOPFHandler_thenCheckItemCalled {

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
    public void checkItem_MockOPFHandler_thenCheckItemCalled() {
        // given
        OPFHandler oPFHandler = new OPFHandler();

        // when
        opfChecker30.checkItem(new OPFItem(), oPFHandler);

        // then
        Mockito.verify(opfChecker30, Mockito.times(1)).checkItem(new OPFItem(), oPFHandler);
    }

}