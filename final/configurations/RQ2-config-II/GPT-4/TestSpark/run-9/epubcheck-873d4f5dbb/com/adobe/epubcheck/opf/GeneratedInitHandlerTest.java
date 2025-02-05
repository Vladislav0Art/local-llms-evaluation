package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInitHandlerTest {

    private final ValidationContext mockContext = new ValidationContext(EPUBVersion.VERSION_3_0);

    @Test
    public void initHandlerTest() {
        OPFChecker30 checker = new OPFChecker30(mockContext);
        checker.initHandler();
        assertTrue(true); // If we reached here, it means no exceptions were thrown.
    }

}