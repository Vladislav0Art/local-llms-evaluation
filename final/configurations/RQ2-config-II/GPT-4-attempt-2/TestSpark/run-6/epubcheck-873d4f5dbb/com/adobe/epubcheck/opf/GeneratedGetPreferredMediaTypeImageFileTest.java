package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedGetPreferredMediaTypeImageFileTest {

    @Test
    public void getPreferredMediaTypeImageFileTest() {
        assertEquals("image/jpeg", OPFChecker30.getPreferredMediaType("image/jpg", "sample.jpeg"));
    }

}