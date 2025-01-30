package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import com.adobe.epubcheck.tool.EpubChecker;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = Spy(EpubChecker.class);
        Report report = Mockito.mock(Report.class);
        int returnValue = epubChecker.validateFile("https://example.com/test.epub", EpubCheck.api.EPUBVersion.VERSION_2, report, EPUBProfile.DEFAULT);
        assertEquals(1, returnValue);
    }

}