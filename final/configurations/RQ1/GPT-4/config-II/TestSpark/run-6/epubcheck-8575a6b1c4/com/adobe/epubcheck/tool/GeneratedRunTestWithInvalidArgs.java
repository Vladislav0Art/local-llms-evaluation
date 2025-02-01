package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GeneratedRunTestWithInvalidArgs {

    @Test
    public void runTestWithInvalidArgs() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(new String[]{});
        assertEquals(1, result);
    }

}