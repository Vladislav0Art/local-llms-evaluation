package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedTest {

    @Test
    public void runInvalidVersionTest() {
        String[] args = {"-v", "4.0"};
        EpubChecker checker = new EpubChecker();
        checker.run(args);
    }

    @Test
    public void runNoVersionArgumentTest() {
        String[] args = {"-v"};
        EpubChecker checker = new EpubChecker();
        checker.run(args);
    }

    @Test
    public void runValidVersionTest() {
        String[] args = {"-v", "3.0"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        Assert.assertEquals(1, result);
    }

    @Test
    public void runCustomMessageFileTest() {
        String[] args = {"-c", "customMessages"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        Assert.assertEquals(1, result);
    }

    @Test
    public void runJsonOutputTest() {
        String[] args = {"-j", "-"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        Assert.assertEquals(1, result);
    }

    @Test
    public void runXmlOutputTest() {
        String[] args = {"-x", "-"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        Assert.assertEquals(1, result);
    }

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale expected = Locale.getDefault();
        Locale actual = checker.getLocale();
        Assert.assertEquals(expected, actual);
    }

}