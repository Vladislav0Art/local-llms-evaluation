package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestOverlayCheckerInvalid {

    @Mock
    private EpubCheckChecker checker;

    @Mock
    private FileResourceProvider resourceProvider;

    @Mock
    private DefaultReportImpl reportProvider;

    @Test
    public void testOverlayCheckerInvalid() throws IOException {
        // Arrange
        Map<String, String> expectedFiles = new HashMap<>();
        expectedFiles.put("path/to/file1", "file1");
        when(checker.overlayChecker(any(), any())).thenReturn(expectedFiles);

        // Act and Assert
        report:
        for (String message : checker.overlayChecker(resourceProvider, null)) {
            if (message.contains("overlay: file1")) {
                assertTrue(message);
                break report;
            }
        }

        verify(checker).overlayChecker(null, null);

        verify(reportProvider).provideReport(null, Collections.emptySet());
    }

}