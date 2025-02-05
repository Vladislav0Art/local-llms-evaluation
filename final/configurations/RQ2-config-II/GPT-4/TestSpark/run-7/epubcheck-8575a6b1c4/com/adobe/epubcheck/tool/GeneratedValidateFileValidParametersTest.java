package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedValidateFileValidParametersTest {

    @Test
    public void validateFileValidParametersTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "validPath";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = new DefaultReportImpl("validPath");
        EPUBProfile profile = EPUBProfile.DEFAULT;
        assertEquals(0, epubChecker.validateFile(path, version, report, profile));
    }

}