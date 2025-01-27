package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedRun_RunCommandWithSingleArgument_ReturnsZero {

    @Test
    public void run_RunCommandWithSingleArgument_ReturnsZero() {
        EpubChecker checker = new EpubChecker();
        when(checker.processEpubFile("test.zip", new String[]{"--version"})).thenReturn(0);
        int result = checker.run(new String[]{"--version"});
        assertEquals(0, result);
    }

}