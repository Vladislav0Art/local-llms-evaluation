package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

public class GeneratedIsBlessedImageTypeTest {

    @Test
    public void isBlessedImageTypeTest() {
        assertTrue(OPFChecker30.isBlessedImageType("image/jpg", EPUBVersion.VERSION_3));
        assertFalse(OPFChecker30.isBlessedImageType("image/tiff", EPUBVersion.VERSION_3));
    }

}