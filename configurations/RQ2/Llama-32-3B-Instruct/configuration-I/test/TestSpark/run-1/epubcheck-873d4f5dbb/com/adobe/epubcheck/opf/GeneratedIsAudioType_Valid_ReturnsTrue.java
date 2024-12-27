package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedIsAudioType_Valid_ReturnsTrue {

    @Test
    public void isAudioType_Valid_ReturnsTrue() {
        //Arrange
        String type = "audio";

        //Act
        boolean result = OPFChecker30.isAudioType(type);

        //Assert
        assertTrue(result);
    }

}