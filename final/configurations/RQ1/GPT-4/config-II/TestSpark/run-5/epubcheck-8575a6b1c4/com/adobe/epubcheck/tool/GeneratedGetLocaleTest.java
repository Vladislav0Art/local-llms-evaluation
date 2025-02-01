package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale result = epubChecker.getLocale();
        assertNotNull(result);
    }

}