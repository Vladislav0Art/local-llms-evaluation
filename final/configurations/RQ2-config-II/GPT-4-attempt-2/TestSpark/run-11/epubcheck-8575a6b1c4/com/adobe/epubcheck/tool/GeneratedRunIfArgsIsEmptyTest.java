package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.ReportingLevel;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import static org.mockito.Mockito.*;

public class GeneratedRunIfArgsIsEmptyTest {

    @Test
    public void runIfArgsIsEmptyTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = new String[]{};
        Assert.assertEquals(-1, checker.run(args));
    }

}