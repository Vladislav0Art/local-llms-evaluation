package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedIsCoreMediaTypeInvalidTypeTest {

    @Test
    public void isCoreMediaTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isCoreMediaType(type);
        assertFalse(result);
    }

}