package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTest {

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

    @Test
    public void testOverlayCheckerValid() throws IOException {
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

        verify(checker).overlayChecker(any(), any());

        verify(reportProvider).provideReport(null, Collections.emptySet());
    }

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

    @Test
    public void testNavCheckerValid() throws IOException {
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

    @Test
    public void testOpfCheckerValid() throws IOException {
        // Arrange
        Map<String, String> expectedFiles = new HashMap<>();
        expectedFiles.put("path/to/file1", "file1");
        when(checker.opfChecker(any(), any())).thenReturn(expectedFiles);

        // Act and Assert
        report:
        for (String message : checker.opfChecker(resourceProvider, null)) {
            if (message.contains("opf: file1")) {
                assertTrue(message);
                break report;
            }
        }

        verify(checker).opfChecker(null, null);

        verify(reportProvider).provideReport(null, Collections.emptySet());
    }

    @Test
    public void testOpfCheckerInvalid() throws IOException {
        // Arrange
        Map<String, String> expectedFiles = new HashMap<>();
        expectedFiles.put("path/to/file1", "file1");
        when(checker.opfChecker(any(), any())).thenReturn(expectedFiles);

        // Act and Assert
        report:
        for (String message : checker.opfChecker(resourceProvider, null)) {
            if (message.contains("opf: file1")) {
                assertTrue(message);
                break report;
            }
        }

        verify(checker).opfChecker(null, null);

        verify(reportProvider).provideReport(null, Collections.emptySet());
    }

}