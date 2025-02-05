package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedRunEmptyArgsTest {

    @Test
    public void runEmptyArgsTest() {
        EpubChecker epubCheck = new EpubChecker();
        String[] args = {};
        assertEquals(-1, epubCheck.run(args));
    }

}