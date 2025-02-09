package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsAudioTypeInvalidTypeTest {

    @Test
    public void isAudioTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isAudioType("invalid"));
    }

}