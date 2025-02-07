package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRun_EmptyArgs_ReturnsZero {

    @Test
    public void run_EmptyArgs_ReturnsZero() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(new String[0]);
        assertEquals(0, result);
    }

}