package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedValidateFileValidArgsTest {

    @Test
    public void validateFileValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "valid.epub";
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl(path);
        EPUBProfile profile = EPUBProfile.OPF_2_0;
        int result = epubChecker.validateFile(path, version, report, profile);
        assertEquals("Result mismatched.", 0, result);
    }

}