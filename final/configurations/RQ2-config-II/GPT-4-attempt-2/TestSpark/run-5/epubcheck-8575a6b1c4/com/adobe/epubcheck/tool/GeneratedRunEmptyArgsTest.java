package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedRunEmptyArgsTest {

    @Test
    public void runEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertEquals(1, epubChecker.run(new String[]{}));
    }

}