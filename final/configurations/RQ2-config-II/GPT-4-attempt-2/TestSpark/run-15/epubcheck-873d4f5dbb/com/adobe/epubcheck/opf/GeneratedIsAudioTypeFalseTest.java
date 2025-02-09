package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsAudioTypeFalseTest {

    @Test
    public void isAudioTypeFalseTest() {
        assertFalse(OPFChecker30.isAudioType("application/pdf"));
    }

}