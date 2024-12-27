package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedIsBlessedFontType_Valid_ReturnsTrue {

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