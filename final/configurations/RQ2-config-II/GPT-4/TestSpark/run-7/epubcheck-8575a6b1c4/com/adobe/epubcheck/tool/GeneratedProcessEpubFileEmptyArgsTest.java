package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedProcessEpubFileEmptyArgsTest {

    @Test
    public void processEpubFileEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};
        assertEquals(-1, epubChecker.processEpubFile(args));
    }

}