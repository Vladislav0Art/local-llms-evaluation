package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Locale;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.tool.EpubChecker;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileWithValidArgsTest {

    @Mock
    Report report;

    @Test
    public void validateFileWithValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "validPath";
        EPUBVersion version = EPUBVersion.VERSION_3_0;
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

}