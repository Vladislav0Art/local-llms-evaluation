package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.File;
import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedRunTest {

    @Test
    public void runTest() {
        String[] arguments = {"arg1", "arg2"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(arguments);
        assertEquals(0, result);
    }

}