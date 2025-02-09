package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedVideoTypeValidTypeTest {

    @Test
    public void isBlessedVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

}