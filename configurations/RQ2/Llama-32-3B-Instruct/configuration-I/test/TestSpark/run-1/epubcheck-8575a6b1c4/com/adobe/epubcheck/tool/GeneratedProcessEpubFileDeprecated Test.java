package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedProcessEpubFileDeprecated Test {

    @Mock
    private Locale locale;

    @Test
    public void processEpubFileDeprecated

    Test() {
        // Not using mock for deprecated method
        assertEquals(0, new EpubChecker().processEpubFile(new String[]{"--valid-arg"}));
    }

}