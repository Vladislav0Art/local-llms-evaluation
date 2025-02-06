package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedRun_Expected returnsValidatedFileCount {

    @Test
    public void run_Expected

    returnsValidatedFileCount() {
        int validatedFileCount = 1;
        when(EpubCheckerFactory.ePubChecker()).thenReturn(new EpubChecker(validatedFileCount));
        assertEquals(validatedFileCount, EpubChecker.run(new String[]{}));
    }

}