package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedIsBlessedVideoTypeInvalidMimeTypeTest {

    @Mock
    private ValidationContext contextMock;

    private OPFChecker30 opfChecker30;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(contextMock.getVersion()).thenReturn(EPUBVersion.VERSION_3);
        this.opfChecker30 = new OPFChecker30(contextMock);
    }

    @Test
    public void isBlessedVideoTypeInvalidMimeTypeTest() {
        boolean result = OPFChecker30.isBlessedVideoType("video/quicktime");
        assertEquals(false, result);
    }

}