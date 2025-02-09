package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertNotNull("Locale should not be null", epubChecker.getLocale());
    }

}