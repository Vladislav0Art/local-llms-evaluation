package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.vocab.DCMESVocab;
import com.adobe.epubcheck.vocab.PackageVocabs;
import com.adobe.epubcheck.w3c.SmartURL;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/otf"));
        assertFalse(OPFChecker30.isFontType("image/jpeg"));
    }

}