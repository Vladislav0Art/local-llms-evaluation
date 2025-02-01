package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.File;
import java.util.Locale;

public class GeneratedRunValidArgsTest {

    @Test
    public void runValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.run(new String[]{"test.epub"});
        assertEquals(1, returnValue);
    }

}