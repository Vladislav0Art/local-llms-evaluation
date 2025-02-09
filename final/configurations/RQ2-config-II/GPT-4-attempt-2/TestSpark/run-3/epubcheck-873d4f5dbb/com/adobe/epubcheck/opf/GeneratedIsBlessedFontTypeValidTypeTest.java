package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedIsBlessedFontTypeValidTypeTest {

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        String type = "font/woff";
        boolean result = OPFChecker30.isBlessedFontType(type);
        assertTrue(result);
    }

}