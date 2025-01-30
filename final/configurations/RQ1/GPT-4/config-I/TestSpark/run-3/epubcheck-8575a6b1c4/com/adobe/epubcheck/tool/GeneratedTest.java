package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;

import java.lang.reflect.Method;
import java.util.Locale;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    DefaultReportImpl reportMock;

    @Test
    public void runValidArgumentsTest() throws Exception {
        String[] args = {"valid/path/file.epub"};
        EpubChecker instance = new EpubChecker();
        int actualResult = instance.run(args);

        assertEquals(1, actualResult);
    }

    @Test
    public void getLocaleDefaultTest() {
        EpubChecker instance = new EpubChecker();
        Locale expectedResult = Locale.getDefault();
        Locale actualResult = instance.getLocale();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void processEpubFileTest() {
        String[] args = {"valid/path/file.epub"};
        EpubChecker instance = new EpubChecker();
        int actualResult = instance.processEpubFile(args);

        assertEquals(1, actualResult);
    }

    @Test
    public void validateFileTest() throws Exception {
        EpubChecker instance = new EpubChecker();
        Method method = EpubChecker.class.getDeclaredMethod("validateFile", String.class, com.adobe.epubcheck.util.EPUBVersion.class, com.adobe.epubcheck.api.Report.class, com.adobe.epubcheck.api.EPUBProfile.class);
        method.setAccessible(true);
        method.invoke(instance, "valid/path/file.xhtml", com.adobe.epubcheck.util.EPUBVersion.VERSION_3, reportMock, com.adobe.epubcheck.api.EPUBProfile.DEFAULT);
    }

    @Test
    public void processFileTest() throws Exception {
        EpubChecker instance = new EpubChecker();
        Method method = EpubChecker.class.getDeclaredMethod("processFile", com.adobe.epubcheck.api.Report.class);
        method.setAccessible(true);
        method.invoke(instance, reportMock);
    }

}