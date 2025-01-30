package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;
import io.mola.galimatias.URL;
import org.w3c.epubcheck.core.Checker;

public class GeneratedProcessFileTest {

    @Test
    public void processFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processFile(Mockito.mock(Report.class));
        assertEquals(1, result);
    }

}