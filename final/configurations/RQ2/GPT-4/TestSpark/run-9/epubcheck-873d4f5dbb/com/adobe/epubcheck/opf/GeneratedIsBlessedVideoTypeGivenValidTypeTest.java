package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import com.adobe.epubcheck.opf.OPFChecker30;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedVideoTypeGivenValidTypeTest {

    @Test
    public void isBlessedVideoTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

}