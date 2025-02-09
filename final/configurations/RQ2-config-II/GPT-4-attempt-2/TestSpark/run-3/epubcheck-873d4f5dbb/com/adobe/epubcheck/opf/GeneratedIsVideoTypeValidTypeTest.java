package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedIsVideoTypeValidTypeTest {

    @Test
    public void isVideoTypeValidTypeTest() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isVideoType(type);
        assertTrue(result);
    }

}