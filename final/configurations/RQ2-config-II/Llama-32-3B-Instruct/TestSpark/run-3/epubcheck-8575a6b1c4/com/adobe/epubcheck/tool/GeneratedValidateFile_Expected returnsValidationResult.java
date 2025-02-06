package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFile_Expected returnsValidationResult {

    @Test
    public void validateFile_Expected

    returnsValidationResult() {
        Report report = new Report();
        int validatedFileCount = 1;
        when(EpubCheckerFactory.ePubChecker()).thenReturn(new EpubChecker(validatedFileCount));
        ValidationResult result = EpubChecker.validateFile("path", EPUBVersion.v40, report, null);
        assertEquals(ValidationResult.SUCCESS, result);
    }

}