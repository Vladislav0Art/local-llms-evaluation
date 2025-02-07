package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRun_InvalidArgs_ThrowsException {

    @Test
    public void run_InvalidArgs_ThrowsException() {
        EpubChecker checker = new EpubChecker();
        try {
            checker.run(new String[]{"invalid"});
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }
}

}