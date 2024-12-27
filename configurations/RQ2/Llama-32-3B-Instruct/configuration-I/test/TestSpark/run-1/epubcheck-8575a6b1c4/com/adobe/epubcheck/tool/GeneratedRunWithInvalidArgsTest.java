package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;

import org.mockito.Mockito;
import org.junit.runner.RunWith;

public class GeneratedRunWithInvalidArgsTest {

    @Mock
    private Locale locale;

    @Test
    public void runWithInvalidArgsTest() {
        String[] args = {"--invalid-arg"};
        when(locale.toString()).thenReturn("en_US");
        EpubChecker epubChecker = new EpubChecker();
        assertEquals(1, epubChecker.run(args));
    }

}