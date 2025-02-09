package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedIsBlessedFontTypeInvalidTypeTest {

    @Test
    public void isBlessedFontTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isBlessedFontType(type);
        assertFalse(result);
    }

}