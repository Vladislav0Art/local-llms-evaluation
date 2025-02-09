package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals(OPFChecker30.getPreferredMediaType("application/pdf", "/path/to/document.pdf"), "application/pdf");
    }

}