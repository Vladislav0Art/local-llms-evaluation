package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.adobe.epubcheck.util.FeatureEnum;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Collections;

import static org.mockito.Mockito.*;

public class GeneratedCheckContentFontTypeTest {

    @Test
    public void checkContentFontTypeTest() {
        String fontType = "font/ttf";
        boolean actual = OPFChecker30.isFontType(fontType);
        assert actual;
    }

}