package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCheckContentTest {

    private final ValidationContext mockContext = new ValidationContext(EPUBVersion.VERSION_3_0);

    @Test
    public void checkContentTest() {
        OPFChecker30 checker = new OPFChecker30(mockContext);
        assertFalse(checker.checkContent());
    }

}