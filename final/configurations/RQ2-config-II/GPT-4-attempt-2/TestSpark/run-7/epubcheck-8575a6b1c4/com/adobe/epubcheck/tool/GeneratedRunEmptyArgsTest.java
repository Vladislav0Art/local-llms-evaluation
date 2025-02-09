package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.MessageDictionaryDumper;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedRunEmptyArgsTest {

    @Test
    public void runEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int statusCode = epubChecker.run(new String[]{});
        assertEquals("Status code should be -1 for empty args", -1, statusCode);
    }

}