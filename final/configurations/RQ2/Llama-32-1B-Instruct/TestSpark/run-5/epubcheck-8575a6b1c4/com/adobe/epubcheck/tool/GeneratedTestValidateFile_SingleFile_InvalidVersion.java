package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_SingleFile_InvalidVersion {

    @Test
    public void testValidateFile_SingleFile_InvalidVersion() {
        // Arrange
        String[] args = {"path_to_file", "-v 4.2"};
        EPUBVersion version = new EPUBVersion(3); // Invalid version for this EPUB file
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new EPUBProfile();

        // Act
        int result = validateFile(args, version, report, profile);

        // Assert
        assert result == 1; // ValidateFile failed
    }

}