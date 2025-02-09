package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedFontTypeValidTypeTest {

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/otf"));
    }

}