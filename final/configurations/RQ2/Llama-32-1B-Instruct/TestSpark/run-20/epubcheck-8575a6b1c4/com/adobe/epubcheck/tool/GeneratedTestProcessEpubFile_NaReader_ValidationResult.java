package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestProcessEpubFile_NaReader_ValidationResult {

    private MockEpubChecker mockEpubChecker;
    private String[] args1 = {"/path/to/file", "1234"};
    private String[] args2 = {"/path/to/file"};

    @BeforeEach
    public void setup() {
        mockEpubChecker = new MockEpubChecker();
    }

    @Test
    public void testProcessEpubFile_NaReader_ValidationResult() throws Exception {
        // Arrange
        EpubCheck check = mockEpubChecker.processEpubFile(args2[0], EPUBVersion.V1, Report.create(), EPUBProfile.EPUB200);

        // Act
        int result = check.run();

        // Assert
        assertEquals(5, result); // 0: Invalid file type (not an .epub), 1: Invalid file path (does not exist), 2: Invalid file extension (.pdf)
    }

}