package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_SingleFile {

    @Test
    public void testValidateFile_SingleFile() {
        // Arrange
        String[] args = {"path_to_file"};
        EPUBVersion version = new EPUBVersion();
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new EPUBProfile();

        // Act
        int result = validateFile(args, version, report, profile);

        // Assert
        assert result == 0; // ValidateFile succeeded
    }

}