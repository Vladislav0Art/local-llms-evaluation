package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GeneratedRunInvalidArgsTest {

    @Test
    public void runInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{});
        assertEquals(1, result);
    }

}