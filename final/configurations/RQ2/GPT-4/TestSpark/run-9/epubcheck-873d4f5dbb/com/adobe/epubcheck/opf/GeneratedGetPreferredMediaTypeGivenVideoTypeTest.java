package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import com.adobe.epubcheck.opf.OPFChecker30;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPreferredMediaTypeGivenVideoTypeTest {

    @Test
    public void getPreferredMediaTypeGivenVideoTypeTest() {
        assertEquals("video/mp4", OPFChecker30.getPreferredMediaType("video/mp4", "/path/to/file.mp4"));
    }

}