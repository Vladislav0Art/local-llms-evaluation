package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.File;
import java.util.Locale;

public class GeneratedValidateFile testValidateFileValidArguments {

    @Test
    public void validateFile

    testValidateFileValidArguments() throws Exception {
        String path = "/path/to/file";
        EPUBVersion version = EPUBVersion.EPUB3;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = EPUBProfile.EPUB3;
        int result = instance.validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

}