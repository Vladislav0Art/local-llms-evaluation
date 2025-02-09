package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedIsCoreMediaTypeValidTypeTest {

    @Test
    public void isCoreMediaTypeValidTypeTest() {
        String type = "text/html";
        boolean result = OPFChecker30.isCoreMediaType(type);
        assertTrue(result);
    }

}