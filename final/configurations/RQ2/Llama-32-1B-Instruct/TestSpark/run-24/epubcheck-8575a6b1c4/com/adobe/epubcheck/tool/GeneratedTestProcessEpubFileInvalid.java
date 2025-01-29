package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestProcessEpubFileInvalid {

    @Mock
    private EpubCheckChecker checker;

    @Mock
    private FileResourceProvider resourceProvider;

    @Mock
    private DefaultReportImpl reportProvider;

    @Test
    public void testProcessEpubFileInvalid() throws IOException {
        // Arrange
        Map<String, String> expectedFiles = new HashMap<>();
        expectedFiles.put("path/to/file1", "file1");
        when(checker.processEpubFile(any(), any())).thenReturn(expectedFiles);

        // Act and Assert
        report:
        for (String message : checker.processEpubFile(resourceProvider, null)) {
            if (message.contains("file1")) {
                assertTrue(message);
                break report;
            }
        }

        verify(checker).processEpubFile(any(), any());

        verify(reportProvider).provideReport(null, Collections.emptySet());
    }

}