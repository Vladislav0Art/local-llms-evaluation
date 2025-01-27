package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class GeneratedRunTest_withValidArgs_returnsZero {

    @Mock
    private Checker checker;

    @Mock
    private FileResourceProvider fileResourceProvider;

    @InjectMocks
    private EpubChecker epubChecker;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void runTest_withValidArgs_returnsZero() throws Exception {
        String[] args = {"-f", "input.epub"};
        int expected = 0;
        when(checker.run(args)).thenReturn(expected);
        int actual = epubChecker.run(args);
        assertEquals(expected, actual);
    }

}