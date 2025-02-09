package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedProcessEpubFile_nullArgs_throwsNullPointerException_4Test {

    @Test
    public void processEpubFile_nullArgs_throwsNullPointerException_4Test() {
        String[] args = null;
        EpubChecker epubChecker = new EpubChecker();
        assertThrows(NullPointerException.class, () -> epubChecker.processEpubFile(args));
    }

}