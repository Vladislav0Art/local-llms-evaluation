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

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Assert.assertEquals(checker.getLocale(), java.util.Locale.getDefault());
    }

}