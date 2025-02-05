package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCoreMediaTypeValidCoreMediaTypeTest {

    //isAudioType tests

    @Test
    public void isCoreMediaTypeValidCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/html"));
    }

}