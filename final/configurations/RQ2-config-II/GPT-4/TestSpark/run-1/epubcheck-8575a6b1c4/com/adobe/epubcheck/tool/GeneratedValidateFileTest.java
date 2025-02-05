package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;

import java.util.Locale;

import org.mockito.Mockito;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker checker = new EpubChecker();
        Report report = Mockito.mock(Report.class);
        String path = "test";
        int result = checker.validateFile(path, EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
        assertEquals(0, result);
    }

}