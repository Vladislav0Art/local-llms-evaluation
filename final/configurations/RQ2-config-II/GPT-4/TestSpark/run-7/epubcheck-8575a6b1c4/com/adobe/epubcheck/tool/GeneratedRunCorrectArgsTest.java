package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedRunCorrectArgsTest {

    @Test
    public void runCorrectArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"arg1", "arg2"};
        assertEquals(0, epubChecker.run(args));
    }

}