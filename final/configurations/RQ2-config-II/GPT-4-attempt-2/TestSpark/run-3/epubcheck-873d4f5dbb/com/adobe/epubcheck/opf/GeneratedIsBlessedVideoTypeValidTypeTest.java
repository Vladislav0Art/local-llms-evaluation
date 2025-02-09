package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedIsBlessedVideoTypeValidTypeTest {

    @Test
    public void isBlessedVideoTypeValidTypeTest() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertTrue(result);
    }

}