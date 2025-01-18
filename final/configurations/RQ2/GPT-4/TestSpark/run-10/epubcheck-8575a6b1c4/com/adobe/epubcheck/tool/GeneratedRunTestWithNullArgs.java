package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GeneratedRunTestWithNullArgs {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void runTestWithNullArgs() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(null);
        assertEquals(-1, result);
    }

}