package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedValidateFileValidPathTest {

    @Test
    public void validateFileValidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "valid.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = new Report() { // it will need a lot of configuration to be used
            //... fill the required methods
        };
        EPUBProfile profile = EPUBProfile.OPF_3_0;
        int result = epubChecker.validateFile(path, version, report, profile);
        Assert.assertEquals(0, result);
    }

}