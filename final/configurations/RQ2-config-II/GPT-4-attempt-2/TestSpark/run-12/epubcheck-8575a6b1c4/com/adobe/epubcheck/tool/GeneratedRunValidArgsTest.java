package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

import org.junit.rules.TemporaryFolder;

public class GeneratedRunValidArgsTest {

    @Test
    public void runValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"path-to-epub", "-v", "3.0"};
        int returnCode = epubChecker.run(args);
        assertEquals(0, returnCode);
    }

}