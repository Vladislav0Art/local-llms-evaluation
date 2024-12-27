package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunTestWithValidArgs Test {

    @Mock
    private Locale locale;

    @Test
    public void runTestWithValidArgs

    Test() {
        String[] args = {"--valid-arg"};
        when(locale.toString()).thenReturn("en_US");
        when(EpubChecker.class.getName()).thenReturn("com.adobe.epubcheck.tool.EpubChecker");
        assertEquals(0, new EpubChecker().run(args));
    }

}