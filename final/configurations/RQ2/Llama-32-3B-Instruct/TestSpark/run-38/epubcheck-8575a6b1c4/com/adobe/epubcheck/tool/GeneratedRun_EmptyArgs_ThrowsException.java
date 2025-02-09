package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedRun_EmptyArgs_ThrowsException {

    @Test
    public void run_EmptyArgs_ThrowsException() {
        String[] args = new String[0];
        EpubChecker checker = new EpubChecker();
        assertThrows(InvalidVersionException.class, () -> checker.run(args));
    }

}