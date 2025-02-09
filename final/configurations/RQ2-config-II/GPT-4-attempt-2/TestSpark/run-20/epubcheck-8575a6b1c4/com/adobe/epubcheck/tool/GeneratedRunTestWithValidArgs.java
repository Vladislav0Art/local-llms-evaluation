package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedRunTestWithValidArgs {

    @Test
    public void runTestWithValidArgs() {
        String[] args = {"arg1", "arg2"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertTrue("Run should return non-negative int for valid args", result >= 0);
    }

}