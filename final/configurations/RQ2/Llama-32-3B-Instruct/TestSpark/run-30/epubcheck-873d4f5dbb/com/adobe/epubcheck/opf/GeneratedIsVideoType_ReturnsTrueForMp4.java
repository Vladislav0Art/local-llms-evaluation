package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedIsVideoType_ReturnsTrueForMp4 {

    @Test
    public void isVideoType_ReturnsTrueForMp4() {
        // arrange
        String type = "mp4";

        // act
        boolean result = OPFChecker30.isVideoType(type);

        // assert
        assertTrue(result);
    }

}