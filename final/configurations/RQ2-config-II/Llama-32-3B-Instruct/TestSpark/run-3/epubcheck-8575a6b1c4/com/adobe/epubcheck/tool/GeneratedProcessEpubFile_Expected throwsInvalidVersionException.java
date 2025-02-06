package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedProcessEpubFile_Expected throwsInvalidVersionException {

    @Test
    public void processEpubFile_Expected

    throwsInvalidVersionException() {
        when(EpubCheckerFactory.ePubChecker()).thenReturn(new EpubChecker(1));
        InvalidVersionException exception = assertThrows(InvalidVersionException.class, () -> EpubChecker.processEpubFile(new String[]{}));
    }

}