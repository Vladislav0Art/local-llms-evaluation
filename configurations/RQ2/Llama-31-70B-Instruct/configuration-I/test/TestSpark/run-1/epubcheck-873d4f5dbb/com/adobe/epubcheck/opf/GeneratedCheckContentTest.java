package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
        boolean result = opfChecker30.checkContent();
        assertTrue(result);
    }

}