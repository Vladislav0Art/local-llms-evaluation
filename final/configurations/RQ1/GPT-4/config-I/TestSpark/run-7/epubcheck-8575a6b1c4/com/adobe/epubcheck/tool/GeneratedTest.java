package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GeneratedTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void runNoArgumentsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.run(new String[]{});
        Assert.assertEquals(1, returnValue);
    }

    @Test
    public void runInvalidArgumentsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.run(new String[]{"invalid"});
        Assert.assertEquals(1, returnValue);
    }

    @Test
    public void runHelpTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.run(new String[]{"--help"});
        Assert.assertEquals(0, returnValue);
    }

    @Test
    public void runVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.run(new String[]{"--version"});
        Assert.assertEquals(0, returnValue);
    }

    @Test
    public void runModeWithoutPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.run(new String[]{"--mode", "opf"});
        Assert.assertEquals(1, returnValue);
    }

    @Test
    public void runModeWithInvalidVersionTest() {
        exceptionRule.expect(InvalidVersionException.class);
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"-v", "5", "--mode", "opf", "testPath"});
    }

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.processEpubFile(new String[]{"--help"});
        Assert.assertEquals(0, returnValue);
    }

}