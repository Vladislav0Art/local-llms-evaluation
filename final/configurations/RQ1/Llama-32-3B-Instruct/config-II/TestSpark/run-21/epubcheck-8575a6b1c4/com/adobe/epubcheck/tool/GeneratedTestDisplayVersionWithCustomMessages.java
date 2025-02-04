package com.adobe.epubcheck.tool;

public class GeneratedTestDisplayVersionWithCustomMessages {

    // Constructor to initialize the tool
    public EpubCheck() {
        this.messages = Messages.getInstance(Locale.getDefault());
    }

    // Method to display help message
    public void displayHelp() {
        outWriter.println(String.format(messages.get("help_text"), version));
    }

    // Method to display EpubCheck version
    public void displayVersion() {
        outWriter.println(String.format(messages.get("epubcheck_version_text"), version));
    }
}

// Public class for Messages instance
public class Messages {
    private Locale locale;

    // Constructor to initialize the messages instance
    public Messages(Locale locale) {
        this.locale = locale;
    }

    // Method to get a message
    public String get(String key) {
        return MessageFormat.format(messages.get(key), locale).toString();
    }
}

// Test class for EpubCheck tool
public class TestEpubCheck {

    @Test
    public void testDisplayVersionWithCustomMessages() {
        // Create an instance of EpubCheck with custom messages
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.setCustomMessageFileFromEnvironment();

        // Display EpubCheck version
        epubCheck.displayVersion();
        verify(outWriter, "EpubCheck version text with custom message");
    }

}