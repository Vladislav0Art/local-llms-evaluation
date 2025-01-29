package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_SingleFile_InvalidVersion_Report {

    @Test
    public void testValidateFile_SingleFile_InvalidVersion_Report() {
        // Arrange
        String[] args = {"path_to_file"};
        EPUBVersion version = new EPUBVersion(4); // Invalid version for this EPUB file
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new EPUBProfile();

        // Act
        int result = validateFile(args, version, report, profile);

        // Assert
        assert result == 1; // ValidateFile failed
    }

}