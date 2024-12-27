package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTest {

    @Test
    public void isAudioType_Valid_ReturnsTrue() {
        //Arrange
        String type = "audio";

        //Act
        boolean result = OPFChecker30.isAudioType(type);

        //Assert
        assertTrue(result);
    }

    @Test
    public void isBlessedAudioType_Valid_ReturnsTrue() {
        //Arrange
        String type = "blessed audio";

        //Act
        boolean result = OPFChecker30.isBlessedAudioType(type);

        //Assert
        assertTrue(result);
    }

    @Test
    public void isVideoType_Valid_ReturnsTrue() {
        //Arrange
        String type = "video";

        //Act
        boolean result = OPFChecker30.isVideoType(type);

        //Assert
        assertTrue(result);
    }

    @Test
    public void isBlessedFontType_Valid_ReturnsTrue() {
        //Arrange
        String type = "blessed font";

        //Act
        boolean result = OPFChecker30.isBlessedFontType(type);

        //Assert
        assertTrue(result);
    }

}