package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedRun_runWithoutValidateArg_test {

    @Test
    public void run_runWithoutValidateArg_test() {
        String[] args = {};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertFalse(result == 0);
    }

}