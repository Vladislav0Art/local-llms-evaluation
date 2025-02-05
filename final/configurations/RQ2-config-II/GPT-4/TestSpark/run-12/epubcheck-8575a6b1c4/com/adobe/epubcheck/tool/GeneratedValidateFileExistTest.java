package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;

import java.util.Locale;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileExistTest {

    @Test
    public void validateFileExistTest() {
        String path = "validPath";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = new DefaultReportImpl("test.epub");
        EPUBProfile profile = EPUBProfile.DEFAULT;
        EpubChecker epubChecker = Mockito.spy(new EpubChecker());
        Mockito.doReturn(report).when(epubChecker).validateFile(path, version, report, profile);
        assertEquals("Expecting return value = 0", 0, epubChecker.validateFile(path, version, report, profile));
    }

}