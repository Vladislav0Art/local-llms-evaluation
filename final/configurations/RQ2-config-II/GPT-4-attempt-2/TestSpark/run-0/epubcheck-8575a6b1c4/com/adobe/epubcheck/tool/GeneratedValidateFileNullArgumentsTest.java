package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedValidateFileNullArgumentsTest {

    @Test
    public void validateFileNullArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        checker.validateFile(null, null, null, null);
    }

}