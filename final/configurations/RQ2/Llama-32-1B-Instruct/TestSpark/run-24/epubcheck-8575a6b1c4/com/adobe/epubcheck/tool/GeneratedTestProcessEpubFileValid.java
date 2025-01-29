package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestProcessEpubFileValid {

    @Mock
    private EpubCheckChecker checker;

    @Mock
    private FileResourceProvider resourceProvider;

    @Mock
    private DefaultReportImpl reportProvider;

    @Test
    public void testProcessEpubFileValid() throws IOException {
        // Arrange
        Map<String, String> expectedFiles = new HashMap<>();
        expectedFiles.put("path/to/file1", "file1");
        when(checker.processEpubFile(any(), any())).thenReturn(expectedFiles);

        // Act
        report:
        for (String message : checker.processEpubFile(resourceProvider, null)) {
            if (message.contains("file1")) {
                assertTrue(message);
                break report;
            }
        }

        verify(checker).processEpubFile(any(), any());

        // Assert
        verify(reportProvider).provideReport(null, Collections.emptySet());
    }

}