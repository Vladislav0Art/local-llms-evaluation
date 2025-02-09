package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedAudioTypeValidTypeTest {

    @Test
    public void isBlessedAudioTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
    }

}