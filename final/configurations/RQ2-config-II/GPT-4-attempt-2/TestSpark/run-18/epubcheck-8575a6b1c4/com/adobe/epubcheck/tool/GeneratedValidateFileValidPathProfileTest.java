package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.Messages;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.FileResourceProvider;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedValidateFileValidPathProfileTest {

    @Test
    public void validateFileValidPathProfileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "test.path";
        EPUBVersion version = EPUBVersion.VERSION_2;
        DefaultReportImpl report = new DefaultReportImpl();
        EPUBProfile profile = EPUBProfile.DEFAULT;
        Assert.assertEquals(0, epubChecker.validateFile(path, version, report, profile));
    }

}