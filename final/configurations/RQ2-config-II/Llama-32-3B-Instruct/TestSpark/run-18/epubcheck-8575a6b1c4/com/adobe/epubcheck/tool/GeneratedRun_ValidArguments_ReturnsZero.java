package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.LocalizableReport;
import org.w3c.epubcheck.core.Checker;
import org.w3c.epubcheck.util.url.URLUtils;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import com.adobe.epubcheck.nav.NavChecker;
import com.adobe.epubcheck.opf.OPFChecker;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.ops.OPSChecker;
import com.adobe.epubcheck.overlay.OverlayChecker;

public class GeneratedRun_ValidArguments_ReturnsZero {

    @Test
    public void run_ValidArguments_ReturnsZero() {
        String[] args = {"arg1", "arg2"};
        ByteArrayOutputStream outWriter = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outWriter);
        System.setOut(printStream);

        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertEquals(0, result);
    }

}