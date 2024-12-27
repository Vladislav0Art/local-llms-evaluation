package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedIsVideoType_Valid_ReturnsTrue {

    @Test
    public void isVideoType_Valid_ReturnsTrue() {
        //Arrange
        String type = "video";

        //Act
        boolean result = OPFChecker30.isVideoType(type);

        //Assert
        assertTrue(result);
    }

}