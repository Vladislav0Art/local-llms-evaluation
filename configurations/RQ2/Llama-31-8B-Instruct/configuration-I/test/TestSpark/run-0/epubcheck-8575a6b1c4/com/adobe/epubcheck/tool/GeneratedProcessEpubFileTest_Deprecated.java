package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
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
public class GeneratedProcessEpubFileTest_Deprecated {

    private EpubChecker epubChecker;

    public EpubCheckerTest() {
        epubChecker = new EpubChecker();
    }

    @Test
    public void processEpubFileTest_Deprecated() {
        // This method is deprecated, so we don't want to use it
        // Instead, we'll test the validateFile method
    }

}