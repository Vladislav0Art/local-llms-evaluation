package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        String result = checker30.getPreferredMediaType("image/jpg", "path");
        assertEquals("image/jpeg", result);
    }

}