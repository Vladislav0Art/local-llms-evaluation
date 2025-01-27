package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedIsAudioType_ReturnsTrueForMpeg {

    @Test
    public void isAudioType_ReturnsTrueForMpeg() {
        // arrange
        String type = "mpeg";

        // act
        boolean result = OPFChecker30.isAudioType(type);

        // assert
        assertTrue(result);
    }

}