package com.adobe.epubcheck.tool;

public class GeneratedTest {

    // ...

    /**
     * Displays a short help message that describes the command-line usage of this tool.
     */
    public void displayHelp() {
        outWriter.println(String.format(messages.get("help_text"), version));
    }

    /**
     * Displays the EpubCheck version.
     */
    public void displayVersion() {
        outWriter.println(String.format(messages.get("epubcheck_version_text"), version));
    }
}

// Test class
public class EpubCheckTest {

    @Test
    public void testDisplayHelp() {
        EpubCheck epubCheck = new EpubCheck();
        epublish.displayHelp();
        assertTrue(epublish.outWriter.hasNextLine());
    }

    @Test
    public void testDisplayVersion() {
        EpubCheck epubCheck = new EpubCheck();
        epublish.displayVersion();
        assertTrue(epublish.outWriter.hasNextLine());
    }

}