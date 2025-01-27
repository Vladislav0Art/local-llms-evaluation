package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class GeneratedValidateFileTest_withValidFile_returnsZero {

    @Mock
    private Checker checker;

    @Mock
    private FileResourceProvider fileResourceProvider;

    @InjectMocks
    private EpubChecker epubChecker;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void validateFileTest_withValidFile_returnsZero() throws Exception {
        String path = "path/to/file.epub";
        int expected = 0;
        when(checker.validateFile(path, EPUBVersion.V2_0, new Report(), new EPUBProfile())).thenReturn(expected);
        int actual = epubChecker.validateFile(path, EPUBVersion.V2_0, new Report(), new EPUBProfile());
        assertEquals(expected, actual);
    }

}