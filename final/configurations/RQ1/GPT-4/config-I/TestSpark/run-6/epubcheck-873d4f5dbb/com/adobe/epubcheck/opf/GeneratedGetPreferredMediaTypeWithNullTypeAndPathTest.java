package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.core.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.Report;
import io.mola.galimatias.URL;
import io.mola.galimatias.MalformedURLException;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedGetPreferredMediaTypeWithNullTypeAndPathTest {

    @Test
    public void getPreferredMediaTypeWithNullTypeAndPathTest() {
        String result = OPFChecker30.getPreferredMediaType(null, null);
        Assert.assertNull(result);
    }

}