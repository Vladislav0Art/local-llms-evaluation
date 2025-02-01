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
public class GeneratedRunValidScenarioTest {

    @Mock
    private Report report;

    @Test
    public void runValidScenarioTest() {
        when(report.initialize()).thenReturn(true);
        when(report.generate()).thenReturn(0);
        EpubChecker checker = new EpubChecker();
        assertEquals(0, checker.run(new String[]{"TestEpub.epub"}));
    }

}