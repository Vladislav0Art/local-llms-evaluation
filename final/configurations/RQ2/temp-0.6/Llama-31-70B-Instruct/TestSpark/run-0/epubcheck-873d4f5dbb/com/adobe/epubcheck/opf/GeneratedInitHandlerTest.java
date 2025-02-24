package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        opfChecker30.initHandler();
        assertTrue(opfChecker30.checkPackage());
    }

}