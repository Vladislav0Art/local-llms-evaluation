package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class GeneratedCheckContentWithNullContextTest {

    @Test
    public void checkContentWithNullContextTest() {
        ValidationContext context = null;
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkContent();
        assertFalse(result);
    }

}