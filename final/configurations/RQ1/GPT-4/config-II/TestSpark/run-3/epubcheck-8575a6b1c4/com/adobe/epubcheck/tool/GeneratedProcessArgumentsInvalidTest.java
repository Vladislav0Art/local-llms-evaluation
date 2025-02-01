package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.util.Archive;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.ReportingLevel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;

public class GeneratedProcessArgumentsInvalidTest {

    @Test
    public void processArgumentsInvalidTest() {
        String[] args = {"-nonexistent", "filename.epub"};
        EpubChecker checker = new EpubChecker();
        Assert.assertFalse(checker.processArguments(args));
    }

}