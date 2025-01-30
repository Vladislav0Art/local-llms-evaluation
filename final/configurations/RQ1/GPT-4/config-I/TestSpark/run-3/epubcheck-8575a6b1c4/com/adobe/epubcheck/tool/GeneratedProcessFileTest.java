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
public class GeneratedProcessFileTest {

    @Mock
    DefaultReportImpl reportMock;

    @Test
    public void processFileTest() throws Exception {
        EpubChecker instance = new EpubChecker();
        Method method = EpubChecker.class.getDeclaredMethod("processFile", com.adobe.epubcheck.api.Report.class);
        method.setAccessible(true);
        method.invoke(instance, reportMock);
    }

}