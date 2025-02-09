package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedValidateFile_EpubFilePassed_InvalidReport_ReturnsInt {

    @Test
    public void validateFile_EpubFilePassed_InvalidReport_ReturnsInt() {
        String path = "test.epub";
        int expectedResult = 0;
        Report report = new DefaultReportImpl();
        when(EpubChecker.class.getConstructor().newInstance()).thenReturn(expectedResult);
        EpubChecker checker = new EpubChecker();
        assertEquals(expectedResult, checker.validateFile(path, EPUBVersion.V2_0_1, report, new EPUBProfile()));
    }

}