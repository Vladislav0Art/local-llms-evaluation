package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedRun_RunCommandWithMultipleArguments_ReturnsNonZero {

    @Test
    public void run_RunCommandWithMultipleArguments_ReturnsNonZero() {
        EpubChecker checker = new EpubChecker();
        when(checker.processEpubFile("test.zip", new String[]{"--version"})).thenReturn(-1);
        int result = checker.run(new String[]{"--version", "--help"});
        assertEquals(-1, result);
    }

}