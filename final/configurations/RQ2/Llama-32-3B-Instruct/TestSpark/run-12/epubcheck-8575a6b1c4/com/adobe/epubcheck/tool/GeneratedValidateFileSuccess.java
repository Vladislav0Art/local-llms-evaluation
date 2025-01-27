package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedValidateFileSuccess {

    @Test
    public void validateFileSuccess() throws IOException {
        String path = "path/to/file.epub";
        EPUBVersion version = EPUBVersion.V1;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new EpubCheckFactory().createProfile();
        int result = EpubChecker.class.newInstance().validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

}