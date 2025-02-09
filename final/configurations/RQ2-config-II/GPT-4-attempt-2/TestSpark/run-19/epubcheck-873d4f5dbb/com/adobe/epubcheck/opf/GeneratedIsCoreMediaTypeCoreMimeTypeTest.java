package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCoreMediaTypeCoreMimeTypeTest {

    @Test
    public void isCoreMediaTypeCoreMimeTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/html"));
    }

}