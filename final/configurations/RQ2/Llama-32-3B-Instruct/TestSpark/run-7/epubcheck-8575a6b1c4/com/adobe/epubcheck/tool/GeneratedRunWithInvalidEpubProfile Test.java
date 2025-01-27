package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedRunWithInvalidEpubProfile Test {

    @Test
    public void runWithInvalidEpubProfile

    Test() {
        EpubChecker instance = Mockito.mock(EpubChecker.class);
        Mockito.when(instance.getLocale()).thenReturn(Locale.ROOT);
        String[] args = {"path", "invalidProfile"};
        int result = instance.run(args);
        assertEquals(-1, result);
    }
}

}