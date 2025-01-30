package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedRunTestSuccess {

    @Test
    public void runTestSuccess() {
        String[] args = {"valid_test_file.epub"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        Assert.assertEquals("Successful execution should return 0.", 0, result);
    }

}