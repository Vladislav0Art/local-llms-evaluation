package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        String actual = OPFChecker30.getPreferredMediaType("text/plain", "test.txt");
        String expected = "application/oebps-package+xml";
        assertEquals(expected, actual);
    }

}