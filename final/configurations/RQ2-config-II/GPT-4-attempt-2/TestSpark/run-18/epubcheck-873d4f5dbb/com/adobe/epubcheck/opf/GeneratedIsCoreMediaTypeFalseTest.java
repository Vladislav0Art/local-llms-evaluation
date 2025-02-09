package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCoreMediaTypeFalseTest {

    @Test
    public void isCoreMediaTypeFalseTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/invalid"));
    }

}