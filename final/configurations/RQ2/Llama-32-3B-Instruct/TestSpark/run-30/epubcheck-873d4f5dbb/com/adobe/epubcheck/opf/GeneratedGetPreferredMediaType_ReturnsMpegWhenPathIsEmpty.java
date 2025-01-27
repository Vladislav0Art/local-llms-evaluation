package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedGetPreferredMediaType_ReturnsMpegWhenPathIsEmpty {

    @Test
    public void getPreferredMediaType_ReturnsMpegWhenPathIsEmpty() {
        // arrange
        String type = "mpeg";
        String path = "";

        // act
        String result = OPFChecker30.getPreferredMediaType(type, path);

        // assert
        assertEquals("mpeg", result);
    }

}