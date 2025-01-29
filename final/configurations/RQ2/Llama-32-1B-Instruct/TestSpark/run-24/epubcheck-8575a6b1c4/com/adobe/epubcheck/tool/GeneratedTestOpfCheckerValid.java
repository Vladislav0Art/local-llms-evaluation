package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestOpfCheckerValid {

    @Mock
    private EpubCheckChecker checker;

    @Mock
    private FileResourceProvider resourceProvider;

    @Mock
    private DefaultReportImpl reportProvider;

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

}