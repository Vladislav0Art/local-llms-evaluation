package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.w3c.epubcheck.core.Checker;
import org.w3c.epubcheck.util.url.URLUtils;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import org.mockito.Mockito;

public class GeneratedRun_run {

    @Test
    public void run_run() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out);
        int result = EpubChecker.run(pw, "arg1", "arg2");
        assertEquals(0, result);
        pw.close();
        out.close();
    }

}