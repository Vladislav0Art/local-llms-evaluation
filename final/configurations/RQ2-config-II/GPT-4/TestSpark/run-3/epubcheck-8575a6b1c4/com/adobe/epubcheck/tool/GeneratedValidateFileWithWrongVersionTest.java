package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedValidateFileWithWrongVersionTest {

    @Test
    public void validateFileWithWrongVersionTest() {
        EPUBVersion version = EPUBVersion.valueOf("Not valid version");
        Report report = Mockito.mock(Report.class);
        EpubChecker checker = new EpubChecker();
        checker.validateFile("validPath.epub", version, report, EpubCheckFactory.EPUBProfile.DEFAULT);
    }

}