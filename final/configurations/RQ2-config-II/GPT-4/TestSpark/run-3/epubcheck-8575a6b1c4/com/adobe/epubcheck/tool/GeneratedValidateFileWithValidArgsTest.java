package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedValidateFileWithValidArgsTest {

    @Test
    public void validateFileWithValidArgsTest() {
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = Mockito.mock(Report.class);
        EpubChecker checker = new EpubChecker();
        Assert.assertEquals(0, checker.validateFile("validPath.epub", version, report, EpubCheckFactory.EPUBProfile.DEFAULT));
    }

}