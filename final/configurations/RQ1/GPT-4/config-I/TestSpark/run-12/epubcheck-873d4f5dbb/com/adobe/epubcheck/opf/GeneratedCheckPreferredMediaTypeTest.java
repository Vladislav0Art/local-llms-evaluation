package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.url.URL;
import com.google.common.base.Optional;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCheckPreferredMediaTypeTest {

    @Test
    public void checkPreferredMediaTypeTest() {
        String result = OPFChecker30.getPreferredMediaType("application/font-sfnt", "test.otf");
        assertEquals("font/otf", result);
    }

}