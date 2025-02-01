package com.adobe.epubcheck.tool;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;

public class GeneratedTest {

    @Test
    public void runArgumentsLengthZeroTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{});
        Assert.assertEquals(1, result);
    }

    @Test
    public void runValidArgumentsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{
                "-m", "opf",
                "-p", "DEFAULT",
                "-v", "3",
                "test-file"
        });
        Assert.assertNotEquals(1, result);
    }

    @Test
    public void runInvalidVersionArgumentTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{
                "-m", "opf",
                "-v",
                "test-file"
        });
        Assert.assertNotEquals(0, result);
    }

    @Test
    public void runInvalidModeArgumentTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{
                "-m",
                "test-file"
        });
        Assert.assertNotEquals(0, result);
    }

    @Test
    public void runInvalidProfileArgumentTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{
                "-p",
                "test-file"
        });
        Assert.assertNotEquals(0, result);
    }

    @Test
    public void processFileExceptionTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{
                "-m", "opf",
                "-p", "DEFAULT",
                "-arfgvdasfop"
        });
        Assert.assertEquals(1, result);
    }

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale result = epubChecker.getLocale();
        Assert.assertNotNull(result);
    }

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report reportMock = mock(Report.class);
        when(reportMock.getFatalErrorCount()).thenReturn(0);
        int result = epubChecker.validateFile("test-file", EPUBVersion.VERSION_3, reportMock, EPUBProfile.DEFAULT);
        Assert.assertNotEquals(-1, result);
        verify(reportMock).getFatalErrorCount();
    }

}