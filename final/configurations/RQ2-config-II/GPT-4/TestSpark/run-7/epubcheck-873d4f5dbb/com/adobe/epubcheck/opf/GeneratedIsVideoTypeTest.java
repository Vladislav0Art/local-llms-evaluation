package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import io.mola.galimatias.URL;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        String type = "video";
        boolean result = OPFChecker30.isVideoType(type);
        assertTrue(result);
    }

}