package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.util.Archive;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.ReportingLevel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;

public class GeneratedRunInvalidArgumentsTest {

    @Test
    public void runInvalidArgumentsTest() {
        String[] args = {"filename.epub"};
        EpubChecker checker = Mockito.spy(new EpubChecker());
        Mockito.doReturn(false).when(checker).processArguments(args);
        checker.run(args);
    }

}