package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInvalidArgsTest {

    @Test
    public void runInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"--invalid", "args"};
        int result = epubChecker.run(args);
        assertEquals("Expected exit code 1 for invalid args", 1, result);
    }

}