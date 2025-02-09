package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsVideoTypeFalseTest {

    @Test
    public void isVideoTypeFalseTest() {
        assertFalse(OPFChecker30.isVideoType("application/pdf"));
    }

}