package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedRunDefaultArgsTest {

    @Test
    public void runDefaultArgsTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(new String[]{});
        assertTrue(result == 0 || result == -1);
    }

}