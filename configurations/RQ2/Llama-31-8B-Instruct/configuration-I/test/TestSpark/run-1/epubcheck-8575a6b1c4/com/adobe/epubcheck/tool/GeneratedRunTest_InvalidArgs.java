package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.JUnit4Runner;
import org.mockito.junit.MockitoJUnitRunner;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.tool.EPUBProfile;
import com.adobe.epubcheck.tool.EPUBVersion;
import com.adobe.epubcheck.tool.Report;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunTest_InvalidArgs {

    private EpubChecker epubChecker;

    @Test
    public void runTest_InvalidArgs() {
        epubChecker = new EpubChecker();
        String[] args = new String[]{"invalid", "arg"};
        assertThrows(IllegalArgumentException.class, () -> epubChecker.run(args));
    }

}