package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.Report;

import java.io.IOException;
import java.util.Locale;

import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.mockito.Mockito;

public class GeneratedRunInvalidArgsTest {

    EpubChecker epubChecker = new EpubChecker();

    @Test
    public void runInvalidArgsTest() {
        epubChecker.run(new String[]{""});
    }

}