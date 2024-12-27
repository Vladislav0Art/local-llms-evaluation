package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.JUnit4Runner;
import org.mockito.junit.MockitoJUnitRunner;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.tool.EPUBProfile;
import com.adobe.epubcheck.tool.EPUBVersion;
import com.adobe.epubcheck.tool.Report;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileTest_NullPath {

    private EpubChecker epubChecker;

    @Test
    public void validateFileTest_NullPath() {
        EPUBVersion version = EPUBVersion.EPUB_2;
        Report report = new Report();
        EPUBProfile profile = new EPUBProfile();
        assertThrows(NullPointerException.class, () -> new EpubChecker().validateFile(null, version, report, profile));
    }

}