package com.adobe.epubcheck.tool;

public class GeneratedTestGetLocale_Us {

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void testGetLocale_Us() {
        assertEquals(Locale.US, epubChecker.getLocale());
    }
}

public class EpubCheckerTest {

    public void testRun_nullArgs_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> epubChecker.run(null));
    }

    public void testRun_validArgs_returnsZero() {
        String[] args = {"arg1", "arg2"};
        assertEquals(0, epubChecker.run(args));
    }
}

}