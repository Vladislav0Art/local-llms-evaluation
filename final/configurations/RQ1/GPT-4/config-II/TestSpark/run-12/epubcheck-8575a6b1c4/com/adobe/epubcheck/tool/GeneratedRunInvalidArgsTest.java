package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedRunInvalidArgsTest {

    @Test
    public void runInvalidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"nonexistent.epub"};
        int result = checker.run(args);
        assertEquals(1, result);
    }

}