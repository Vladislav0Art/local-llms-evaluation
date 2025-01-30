package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import java.io.File;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.w3c.epubcheck.core.Checker;
import org.w3c.epubcheck.util.Archive;
import com.adobe.epubcheck.api.EpubCheck;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedProcessFileExpandedTest {

    @Mock
    private EpubCheck epubCheckMock;

    @Test
    public void processFileExpandedTest() throws Exception {
        EpubChecker epubChecker = spy(EpubChecker.class);
        epubChecker.expanded = true;
        epubChecker.path = System.getProperty("java.io.tmpdir");
        epubChecker.validateFile = mock(Archive.class);
        epubChecker.processFile(mock(Report.class));
        verify(epubChecker, times(1)).validateFile(anyString(), any(EPUBVersion.class), any(Report.class), any(EPUBProfile.class));
    }

}