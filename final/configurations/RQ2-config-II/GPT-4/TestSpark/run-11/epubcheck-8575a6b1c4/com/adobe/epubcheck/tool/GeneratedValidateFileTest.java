package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        String path = "test/path";
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = mock(Report.class);
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(path, version, report);
        assertEquals(1, result);
    }

}