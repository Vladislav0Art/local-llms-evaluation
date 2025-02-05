package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import io.mola.galimatias.URL;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        String type = "font";
        boolean result = OPFChecker30.isFontType(type);
        assertTrue(result);
    }

}