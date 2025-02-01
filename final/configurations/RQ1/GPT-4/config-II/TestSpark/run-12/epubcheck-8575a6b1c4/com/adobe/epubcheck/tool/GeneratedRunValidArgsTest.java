package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedRunValidArgsTest {

    @Test
    public void runValidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"test.epub"};
        int result = checker.run(args);
        assertEquals(0, result);
    }

}