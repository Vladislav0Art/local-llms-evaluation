package com.adobe.epubcheck.tool;

public class GeneratedTest {

    // ... (other fields, constructors, etc.)

    /**
     * Displays the help message.
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

    // ... (other methods, etc.)
}

public class EpubCheckTestCase {
    private EpubCheck check;

    @Before
    public void setUp() {
        check = new EpubCheck();
        check.messages = Messages.getInstance(Locale.getDefault());
        check.useCustomMessageFile = false;
        check.customMessageFile = null;
        check.path = null;
        check.listChecksOut = null;
        check.mode = null;
        check.version = "1.2.3";
    }

    @Test
    public void testDisplayHelp() {
        check.displayHelp();
        // Check that help message is printed
    }

    @Test
    public void testDisplayVersion() {
        check.displayVersion();
        // Check that version message is printed
    }

}