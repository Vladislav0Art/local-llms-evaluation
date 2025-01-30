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
public class GeneratedValidateFileCheckerInstanceEpubCheckTest {

    @Mock
    private EpubCheck epubCheckMock;

    @Test
    public void validateFileCheckerInstanceEpubCheckTest() throws Exception {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(new File("src/test/resources/epub/valid.epub").getAbsolutePath(),
                EPUBVersion.VERSION_3, mock(Report.class), EPUBProfile.DEFAULT);
        assertEquals(0, result);
    }

}