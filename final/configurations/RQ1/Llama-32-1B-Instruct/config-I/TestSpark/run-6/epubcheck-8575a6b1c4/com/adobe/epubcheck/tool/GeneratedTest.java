package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTest {

    @Test
    public void testDisplayHelp() {
        // Arrange
        String[] args = {"--help"};

        // Act
        EpubCheck epubCheck = new EpubCheck();

        // Assert
        assertTrue(epubCheck.displayHelp());
    }

    @Test
    public void testDisplayVersion() {
        // Arrange
        String[] args = {"--version"};

        // Act
        EpubCheck epubCheck = new EpubCheck();

        // Assert
        assertTrue(epubCheck.displayVersion());
    }

    @Test
    public void testSetCustomMessageFileFromEnvironment() {
        // Arrange
        String[] env = {"/path/to/custom/message/file"};
        boolean expectedCustomMessageFile = false;

        // Act
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.setCustomMessageFileFromEnvironment(env, expectedCustomMessageFile);

        // Assert
        assertTrue(epubCheck.customMessageFile() != null);
        assertTrue(epubCheck.useCustomMessageFile());
        assertTrue(expectedCustomMessageFile);
    }

    @Test
    public void testDisplayVersionWithMode() {
        // Arrange
        String[] args = {"--version", "mode"};

        // Act
        EpubCheck epubCheck = new EpubCheck();
        boolean expectedOutput = true;
        epubCheck.mode = mode;

        // Assert
        assertTrue(epubCheck.displayVersion());
    }

    @Test
    public void testSetModeAndPath() {
        // Arrange
        String[] args = {"--mode", "mode", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfile() {
        // Arrange
        String[] args = {"--mode", "profile"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPath() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputType() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file", "--output-type", "xml"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpOutput() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file", "--output-type", "xmp"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndJsonOutput() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file", "--output-type", "json"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonOutput() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file", "--output-type", "xmp", "--output-type", "json"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonAndListChecks() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonAndListChecks() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonAndListChecks() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonAndListChecks() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonAndListChecks() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonAndListChecks() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonAndListChecks() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonAndListChecks() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonAndListChecks() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

}