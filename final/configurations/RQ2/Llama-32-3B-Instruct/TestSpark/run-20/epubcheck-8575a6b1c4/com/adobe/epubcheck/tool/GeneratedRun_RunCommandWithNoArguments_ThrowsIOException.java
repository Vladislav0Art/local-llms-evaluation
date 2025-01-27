package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedRun_RunCommandWithNoArguments_ThrowsIOException {

    @Test
    public void run_RunCommandWithNoArguments_ThrowsIOException() {
        EpubChecker checker = new EpubChecker();
        try {
            checker.run(new String[]{});
            assert false;
        } catch (IOException e) {
            assertTrue(true);
        }
    }

}