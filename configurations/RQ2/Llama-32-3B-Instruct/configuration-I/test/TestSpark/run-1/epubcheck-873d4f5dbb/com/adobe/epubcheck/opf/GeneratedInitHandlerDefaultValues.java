package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedInitHandlerDefaultValues {

    @Test
    public void initHandlerDefaultValues() {
        //Arrange
        ValidationContext context = new ValidationContext();

        //Act
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.initHandler();

        //Assert
        assertFalse(opfChecker30.isAudioType("invalid"));
    }

}