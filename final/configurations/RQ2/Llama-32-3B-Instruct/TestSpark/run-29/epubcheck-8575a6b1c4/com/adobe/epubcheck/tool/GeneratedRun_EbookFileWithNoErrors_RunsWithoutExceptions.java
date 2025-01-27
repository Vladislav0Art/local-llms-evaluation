package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedRun_EbookFileWithNoErrors_RunsWithoutExceptions {

    @Test
    public void run_EbookFileWithNoErrors_RunsWithoutExceptions() {
        String[] args = {"file.ebk"};
        EpubChecker epubChecker = new EpubChecker();
        int result = (int) epubChecker.run(args);
        assertTrue(result >= 0);
    }

}