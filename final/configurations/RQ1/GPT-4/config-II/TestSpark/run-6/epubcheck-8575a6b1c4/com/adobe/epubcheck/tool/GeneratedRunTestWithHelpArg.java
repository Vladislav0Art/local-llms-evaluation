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

public class GeneratedRunTestWithHelpArg {

    @Test
    public void runTestWithHelpArg() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(new String[]{"-help"});
        assertEquals(0, result);
    }

}