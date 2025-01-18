package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("application/javascript", OPFChecker30.getPreferredMediaType("text/javascript", "path/to/file.js"));
        assertEquals("text/vcard", OPFChecker30.getPreferredMediaType("text/x-vcard", "path/to/file.vcf"));
    }

}