package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedRun_EpubFilePassed_ReturnsInt {

    @Test
    public void run_EpubFilePassed_ReturnsInt() {
        String epubFile = "test.epub";
        int expectedResult = 0;
        when(EpubChecker.class.getConstructor().newInstance()).thenReturn(expectedResult);
        EpubChecker checker = new EpubChecker();
        assertEquals(expectedResult, checker.run(new String[]{epubFile}));
    }

}