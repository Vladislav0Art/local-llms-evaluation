package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        ValidationContext context = new ValidationContext(EPUBVersion.VERSION_3, "path", "mimetype");
        OPFChecker30 checker = new OPFChecker30(context);

        boolean result = checker.checkContent();

        assertTrue(result);
    }

}