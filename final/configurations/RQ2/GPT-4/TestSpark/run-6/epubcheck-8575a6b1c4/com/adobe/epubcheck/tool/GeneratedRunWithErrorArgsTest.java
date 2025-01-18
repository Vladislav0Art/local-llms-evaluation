package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRunWithErrorArgsTest {

    @Test
    public void runWithErrorArgsTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(new String[]{"-invalid"});
        assertNotEquals("Expect non-zero when invalid arguments are passed", 0, result);
    }

}