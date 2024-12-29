package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedCheckPackage_MockOPFItem_thenCheckPackageCalled {

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
    public void checkPackage_MockOPFItem_thenCheckPackageCalled() {
        // given
        OPFItem oPFItem = new OPFItem();

        // when
        opfChecker30.checkPackage(oPFItem);

        // then
        Mockito.verify(opfChecker30, Mockito.times(1)).checkPackage(oPFItem);
    }

}