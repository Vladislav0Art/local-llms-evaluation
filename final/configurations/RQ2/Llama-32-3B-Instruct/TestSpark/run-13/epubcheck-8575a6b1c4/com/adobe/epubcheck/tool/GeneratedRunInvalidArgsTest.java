package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedRunInvalidArgsTest {

    @Test
    public void runInvalidArgsTest() {
        EpubChecker checker = new EpubChecker();
        try {
            checker.run(new String[]{"invalid", "arg"});
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(true); // Expected exception
        }
    }

}