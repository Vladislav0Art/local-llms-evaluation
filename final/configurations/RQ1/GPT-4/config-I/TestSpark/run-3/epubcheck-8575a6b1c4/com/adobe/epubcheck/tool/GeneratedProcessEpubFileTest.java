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
public class GeneratedProcessEpubFileTest {

    @Mock
    DefaultReportImpl reportMock;

    @Test
    public void processEpubFileTest() {
        String[] args = {"valid/path/file.epub"};
        EpubChecker instance = new EpubChecker();
        int actualResult = instance.processEpubFile(args);

        assertEquals(1, actualResult);
    }

}