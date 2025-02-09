package com.adobe.epubcheck.tool;

public class GeneratedRun_NonEmptyArgs_ThrowsException {

    @Test
    public void run_NonEmptyArgs_ThrowsException() {
        assertThrows(InvalidArgumentException.class, () -> EpubChecker.getInstance().run(new String[0]));
    }

}