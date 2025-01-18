package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsVideoTypeInvalidVideoTypeTest {

    @Test
    public void isVideoTypeInvalidVideoTypeTest() {
        assertFalse(OPFChecker30.isVideoType("video/pdf"));
    }

}