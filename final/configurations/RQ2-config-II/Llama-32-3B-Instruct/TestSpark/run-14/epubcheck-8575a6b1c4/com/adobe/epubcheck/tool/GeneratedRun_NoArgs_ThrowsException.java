package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRun_NoArgs_ThrowsException {

    @Mock
    private Checker checker;

    @Mock
    private LocalizableReport report;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void run_NoArgs_ThrowsException() {
        try {
            epubChecker.run(new String[0]);
            assert false;
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

}