package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsVideoTypeNonVideoMimeTypeTest {

    @Test
    public void isVideoTypeNonVideoMimeTypeTest() {
        assertFalse(OPFChecker30.isVideoType("text/plain"));
    }

}