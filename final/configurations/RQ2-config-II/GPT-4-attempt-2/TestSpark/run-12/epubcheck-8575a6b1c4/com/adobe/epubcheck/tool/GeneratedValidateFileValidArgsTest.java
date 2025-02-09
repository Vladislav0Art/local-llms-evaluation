package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

import org.junit.rules.TemporaryFolder;

public class GeneratedValidateFileValidArgsTest {

    @Test
    public void validateFileValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report reportMock = mock(Report.class);
        String path = "/path/to/file";
        int returnCode = epubChecker.validateFile(path, EPUBVersion.VERSION_2, reportMock, EPUBProfile.DEFAULT);
        assertEquals(0, returnCode);
    }

}