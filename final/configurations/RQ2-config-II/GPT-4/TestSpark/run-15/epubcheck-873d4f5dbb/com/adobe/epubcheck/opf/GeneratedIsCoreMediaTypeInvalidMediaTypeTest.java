package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCoreMediaTypeInvalidMediaTypeTest {

    //isAudioType tests

    @Test
    public void isCoreMediaTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/x-shockwave-flash"));
    }

}