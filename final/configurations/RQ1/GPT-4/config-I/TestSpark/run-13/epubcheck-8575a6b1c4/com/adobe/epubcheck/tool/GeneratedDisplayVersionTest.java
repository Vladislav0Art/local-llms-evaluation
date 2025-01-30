package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.util.Messages;
import com.adobe.epubcheck.util.outWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Locale;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDisplayVersionTest {

    @Test
    public void displayVersionTest() {
        EpubChecker epubChecker = spy(EpubChecker.class);
        epubChecker.displayVersion();
        verify(outWriter, times(1)).println(String.format(Messages.getInstance().get("epubcheck_version_text"), EpubCheck.version()));
    }

}