package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedProcessEpubFile_DeprecatedMethod_ThrowsException {

    @Test
    public void processEpubFile_DeprecatedMethod_ThrowsException() {
        EpubChecker checker = new EpubChecker();
        try {
            checker.processEpubFile(new String[0]);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }
}

}