package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedProcessEpubFile_Expected returnsValidationResult {

    @Test
    public void processEpubFile_Expected

    returnsValidationResult() {
        Report report = new Report();
        when(EpubCheckerFactory.ePubChecker()).thenReturn(new EpubChecker(1));
        ValidationResult result = EpubChecker.processEpubFile(new String[]{"-e", "path"});
        assertEquals(ValidationResult.SUCCESS, result);
    }

}