package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.File;
import java.util.Locale;

public class GeneratedValidateFile_testValidateFileWithInvalidArguments {

    @Test
    public void validateFile_testValidateFileWithInvalidArguments() {
        String path = "/path/to/file";
        EPUBVersion version = null;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = null;
        instance.validateFile(path, version, report, profile);
    }

}