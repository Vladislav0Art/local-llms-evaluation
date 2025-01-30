package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeTest() {
        String fontType = "font/ttf";
        assert (OPFChecker30.isBlessedFontType(fontType));
    }

}