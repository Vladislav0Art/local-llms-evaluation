package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;

import org.mockito.Mockito;
import org.junit.runner.RunWith;

public class GeneratedRunWithValidArgsTest {

    @Mock
    private Locale locale;

    @Test
    public void runWithValidArgsTest() {
        String[] args = {"--valid-arg"};
        when(locale.toString()).thenReturn("en_US");
        EpubChecker epubChecker = new EpubChecker();
        assertEquals(0, epubChecker.run(args));
    }

}