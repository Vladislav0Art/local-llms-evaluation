package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedProcessEpubFileTest {

    @Mock
    private Report report;

    @Test
    public void processEpubFileTest() {
        EpubChecker checker = new EpubChecker();
        assertEquals(1, checker.processEpubFile(new String[]{"invalidPath"}));
    }

}