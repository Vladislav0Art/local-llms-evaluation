package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedValidateFileWithInvalidFileAndProfileReturnsZero {

    @Test
    public void validateFileWithInvalidFileAndProfileReturnsZero() {
        File file = new File("test.file");
        EPUBVersion version = EPUBVersion.EPUB3;
        Report report = new DefaultReportImpl();
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(file.getAbsolutePath(), version, report, new HashMap<>());
        assertEquals(0, result);
    }

}

public class MockEpubCheck {

    public static EpubCheck create() {
        return mock(EpubCheck.class);
    }

}