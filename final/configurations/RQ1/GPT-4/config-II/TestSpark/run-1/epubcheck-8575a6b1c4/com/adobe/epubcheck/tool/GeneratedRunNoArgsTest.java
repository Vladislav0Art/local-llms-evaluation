package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.Messages;

public class GeneratedRunNoArgsTest {

    @Test
    public void runNoArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};

        assertEquals(1, epubChecker.run(args));
    }

}