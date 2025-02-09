package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunValidArgsTest {

    @Test
    public void runValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"--profile", "default"};
        int result = epubChecker.run(args);
        assertEquals("Expected exit code 0 for valid args", 0, result);
    }

}