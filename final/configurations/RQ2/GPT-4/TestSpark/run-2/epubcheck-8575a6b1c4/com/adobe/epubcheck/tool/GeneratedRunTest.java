package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.Report;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedRunTest {

    @Test
    public void runTest() {
        EpubChecker epubChecker = Mockito.spy(EpubChecker.class);
        String[] args = {"arg1", "arg2"};
        Mockito.when(epubChecker.run(args)).thenReturn(0);
        assertEquals(0, epubChecker.run(args));
    }

}