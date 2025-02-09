package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCoreMediaTypeNonCoreMimeTypeTest {

    @Test
    public void isCoreMediaTypeNonCoreMimeTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("text/plain"));
    }

}