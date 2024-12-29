package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedGetPreferredMediaType_MockString_andPath_thenGetPreferredMediaTypeCalled {

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
    public void getPreferredMediaType_MockString_andPath_thenGetPreferredMediaTypeCalled() {
        // given
        String type = "application/pdf";
        String path = "/path/to/file.pdf";

        // when
        String result = OPFChecker30.getPreferredMediaType(type, path);

        // then
        assertNotNull(result);
    }

}