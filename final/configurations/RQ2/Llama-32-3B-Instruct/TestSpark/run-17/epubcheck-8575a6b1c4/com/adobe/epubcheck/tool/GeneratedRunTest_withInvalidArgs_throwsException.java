package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class GeneratedRunTest_withInvalidArgs_throwsException {

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
    public void runTest_withInvalidArgs_throwsException() throws Exception {
        String[] args = {"-f", "input.epub"};
        when(checker.run(args)).thenThrow(new Exception());
        assertThrows(Exception.class, () -> epubChecker.run(args));
    }

}