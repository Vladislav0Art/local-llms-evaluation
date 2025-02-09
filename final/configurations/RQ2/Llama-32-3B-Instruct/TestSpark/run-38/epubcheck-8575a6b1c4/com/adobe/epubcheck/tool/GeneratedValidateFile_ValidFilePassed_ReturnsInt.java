package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedValidateFile_ValidFilePassed_ReturnsInt {

    @Test
    public void validateFile_ValidFilePassed_ReturnsInt() {
        String path = "test.epub";
        int expectedResult = 0;
        when(EpubChecker.class.getConstructor().newInstance()).thenReturn(expectedResult);
        EpubChecker checker = new EpubChecker();
        assertEquals(expectedResult, checker.validateFile(path, EPUBVersion.V2_0_1, new Report(), new EPUBProfile()));
    }

}