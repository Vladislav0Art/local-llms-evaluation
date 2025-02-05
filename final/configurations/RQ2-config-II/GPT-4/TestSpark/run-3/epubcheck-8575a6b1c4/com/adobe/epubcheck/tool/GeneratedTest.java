package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Assert.assertNotNull(checker.getLocale());
    }

    @Test
    public void runWithValidArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"arg1", "arg2"};
        int result = checker.run(args);
        Assert.assertEquals(0, result);
    }

    @Test
    public void runWithNoArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {};
        int result = checker.run(args);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void processEpubFileWithValidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"path/to/file", "version"};
        int result = checker.processEpubFile(args);
        Assert.assertEquals(0, result);
    }

    @Test
    public void validateFileWithValidArgsTest() {
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = Mockito.mock(Report.class);
        EpubChecker checker = new EpubChecker();
        Assert.assertEquals(0, checker.validateFile("validPath.epub", version, report, EpubCheckFactory.EPUBProfile.DEFAULT));
    }

    @Test
    public void validateFileWithInValidArgsTest() {
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = Mockito.mock(Report.class);
        EpubChecker checker = new EpubChecker();
        Assert.assertEquals(-1, checker.validateFile("", version, report, EpubCheckFactory.EPUBProfile.DEFAULT));
    }

    @Test
    public void validateFileWithWrongVersionTest() {
        EPUBVersion version = EPUBVersion.valueOf("Not valid version");
        Report report = Mockito.mock(Report.class);
        EpubChecker checker = new EpubChecker();
        checker.validateFile("validPath.epub", version, report, EpubCheckFactory.EPUBProfile.DEFAULT);
    }

}