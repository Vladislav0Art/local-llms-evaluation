package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedCheckContent_MockOPFItem_thenCheckContentCalled {

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
    public void checkContent_MockOPFItem_thenCheckContentCalled() {
        // given
        OPFItem oPFItem = new OPFItem();

        // when
        opfChecker30.checkContent(oPFItem);

        // then
        Mockito.verify(opfChecker30, Mockito.times(1)).checkContent(oPFItem);
    }

}