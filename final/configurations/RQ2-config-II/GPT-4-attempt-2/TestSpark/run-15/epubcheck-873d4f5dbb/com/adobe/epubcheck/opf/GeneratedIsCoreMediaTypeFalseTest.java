package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCoreMediaTypeFalseTest {

    @Test
    public void isCoreMediaTypeFalseTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/pdf"));
    }

}