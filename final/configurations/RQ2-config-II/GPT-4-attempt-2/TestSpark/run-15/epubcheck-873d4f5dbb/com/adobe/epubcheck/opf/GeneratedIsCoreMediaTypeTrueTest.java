package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCoreMediaTypeTrueTest {

    @Test
    public void isCoreMediaTypeTrueTest() {
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

}