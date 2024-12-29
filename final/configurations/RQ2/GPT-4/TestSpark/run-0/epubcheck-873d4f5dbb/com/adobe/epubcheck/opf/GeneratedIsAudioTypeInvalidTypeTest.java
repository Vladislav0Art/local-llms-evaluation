package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsAudioTypeInvalidTypeTest {

    @Test
    public void isAudioTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isAudioType("image/jpeg"));
    }

}