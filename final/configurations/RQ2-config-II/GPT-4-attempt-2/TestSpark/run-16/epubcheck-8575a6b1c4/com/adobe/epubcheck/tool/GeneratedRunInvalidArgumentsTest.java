package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedRunInvalidArgumentsTest {

    @Test
    public void runInvalidArgumentsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] invalidArgs = {"", ""};
        assertEquals("Should return 1 for invalid arguments", 1, epubChecker.run(invalidArgs));
    }

}