package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedRunWithEpubProfile Test {

    @Test
    public void runWithEpubProfile

    Test() {
        EpubChecker instance = Mockito.mock(EpubChecker.class);
        Mockito.when(instance.getLocale()).thenReturn(Locale.ROOT);
        String[] args = {"path", "profile"};
        int result = instance.run(args);
        assertEquals(0, result);
    }

}