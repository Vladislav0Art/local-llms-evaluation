package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestNavCheckerInvalid {

    @Mock
    private EpubCheckChecker checker;

    @Mock
    private FileResourceProvider resourceProvider;

    @Mock
    private DefaultReportImpl reportProvider;

    @Test
    public void testNavCheckerInvalid() throws IOException {
        // Arrange
        Map<String, String> expectedFiles = new HashMap<>();
        expectedFiles.put("path/to/file1", "file1");
        when(checker.navChecker(any(), any())).thenReturn(expectedFiles);

        // Act and Assert
        report:
        for (String message : checker.navChecker(resourceProvider, null)) {
            if (message.contains("nav: file1")) {
                assertTrue(message);
                break report;
            }
        }

        verify(checker).navChecker(null, null);

        verify(reportProvider).provideReport(null, Collections.emptySet());
    }

}