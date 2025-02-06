package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedProcessEpubFile_DeprecatedMethodIsNotCalled {

    @Test
    public void processEpubFile_DeprecatedMethodIsNotCalled() {
        EpubChecker epubChecker = new EpubChecker();
        try {
            epubChecker.processEpubFile(new String[]{"arg1", "arg2"});
            fail("Expected exception was thrown");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }
}

}