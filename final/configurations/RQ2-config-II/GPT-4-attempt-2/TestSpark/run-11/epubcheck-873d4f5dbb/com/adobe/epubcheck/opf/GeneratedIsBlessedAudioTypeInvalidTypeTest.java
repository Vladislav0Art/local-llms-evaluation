package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedAudioTypeInvalidTypeTest {

    @Test
    public void isBlessedAudioTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("invalid"));
    }

}