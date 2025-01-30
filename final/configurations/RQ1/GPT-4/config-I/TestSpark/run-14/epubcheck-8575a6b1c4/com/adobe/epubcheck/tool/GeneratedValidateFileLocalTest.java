package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedValidateFileLocalTest {

    @Test
    public void validateFileLocalTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile("../randompath.epub", EPUBVersion.VERSION_3, Mockito.mock(Report.class), EPUBProfile.DEFAULT);
        assertEquals(1, result);
    }

}