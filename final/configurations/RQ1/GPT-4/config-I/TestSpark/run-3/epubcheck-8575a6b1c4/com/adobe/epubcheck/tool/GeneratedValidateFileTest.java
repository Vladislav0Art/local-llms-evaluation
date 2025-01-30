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
public class GeneratedValidateFileTest {

    @Mock
    DefaultReportImpl reportMock;

    @Test
    public void validateFileTest() throws Exception {
        EpubChecker instance = new EpubChecker();
        Method method = EpubChecker.class.getDeclaredMethod("validateFile", String.class, com.adobe.epubcheck.util.EPUBVersion.class, com.adobe.epubcheck.api.Report.class, com.adobe.epubcheck.api.EPUBProfile.class);
        method.setAccessible(true);
        method.invoke(instance, "valid/path/file.xhtml", com.adobe.epubcheck.util.EPUBVersion.VERSION_3, reportMock, com.adobe.epubcheck.api.EPUBProfile.DEFAULT);
    }

}