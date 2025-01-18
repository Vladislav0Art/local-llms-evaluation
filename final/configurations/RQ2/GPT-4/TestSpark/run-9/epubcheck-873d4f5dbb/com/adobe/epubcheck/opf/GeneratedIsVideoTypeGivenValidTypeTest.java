package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import com.adobe.epubcheck.opf.OPFChecker30;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsVideoTypeGivenValidTypeTest {

    @Test
    public void isVideoTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}