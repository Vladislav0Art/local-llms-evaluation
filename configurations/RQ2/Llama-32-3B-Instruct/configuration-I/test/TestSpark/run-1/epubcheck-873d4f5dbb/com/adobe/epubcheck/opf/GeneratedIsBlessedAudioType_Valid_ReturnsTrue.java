package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedIsBlessedAudioType_Valid_ReturnsTrue {

    @Test
    public void isBlessedAudioType_Valid_ReturnsTrue() {
        //Arrange
        String type = "blessed audio";

        //Act
        boolean result = OPFChecker30.isBlessedAudioType(type);

        //Assert
        assertTrue(result);
    }

}