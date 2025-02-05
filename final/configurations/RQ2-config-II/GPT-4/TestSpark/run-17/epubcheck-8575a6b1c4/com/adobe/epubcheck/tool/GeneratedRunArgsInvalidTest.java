package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunArgsInvalidTest {

    @Mock
    EpubChecker epubChecker;

    @Test
    public void runArgsInvalidTest() {
        String[] args = {"arg1", "arg2"};
        when(epubChecker.run(args)).thenReturn(-1);
        assertEquals(-1, epubChecker.run(args));
        verify(epubChecker, times(1)).run(args);
    }

}