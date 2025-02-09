package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedValidateFileTest_GetReport_DoesNotContainAnyMessage {

    @Test
    public void validateFileTest_GetReport_DoesNotContainAnyMessage() {
        String path = "test_file.epub";
        EPUBVersion version = EPUBVersion.V3_02;
        Report report = new DefaultReportImpl();
        EpubChecker checker = new EpubChecker();
        LocalizableReport localizableReport = checker.validateFile(path, version, null, null);
        assertTrue(localizableReport.getMessages().isEmpty());
    }

}