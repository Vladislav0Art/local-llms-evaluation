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

public class GeneratedRunTestWithFileArgs {

    @Test
    public void runTestWithFileArgs() {
        EpubChecker checker = new EpubChecker();
        String[] args = {getClass().getResource("/books/valid.epub").getPath()};
        int result = checker.run(args);
        assertEquals(0, result);
    }

}