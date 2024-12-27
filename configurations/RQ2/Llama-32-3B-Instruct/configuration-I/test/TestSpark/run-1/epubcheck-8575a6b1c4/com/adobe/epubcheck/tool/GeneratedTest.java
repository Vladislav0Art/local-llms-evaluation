package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;

import org.mockito.Mockito;
import org.junit.runner.RunWith;

public class GeneratedTest {

    public String getLocale() { /* implementation */ }

    public int run(String[] args) { /* implementation */ }

    @Deprecated
    public int processEpubFile(File file) { /* implementation */ }

    public int validateFile(String path, String version, Report report, EPUBProfile profile) { /* implementation */ }
}

public class Test {
    public static EpubChecker createEpubChecker() {
        return new EpubChecker();
    }

}