package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestEpubCheckEmptyFileV1 {

    @Mock
    private Report report;

    @Mock
    private EpubProfile profile;

    @Mock
    private EpubFile epubFile;

    private EpubChecker checker;

    public void setUp() {
        // Assume EpubChecker is initialized somewhere else in the setup process
        checker = new EpubChecker();
        when(epubFile.getMetadata()).thenReturn(Mockito.anyMap());
        when(epubFile.getContent()).thenReturn("some content");
    }

    @Test
    public void testEpubCheckEmptyFileV1() {
        // Given
        String filePath = "test.epub";
        File f = new File(filePath);
        boolean valid = false;

        // When
        when(checker.validateFile(f.getAbsolutePath(), EpubVersion.V1, report, profile)).thenReturn(valid);

        // Then
        assertThat(checker.validateFile(f.getAbsolutePath(), EpubVersion.V1, report, profile)).isEqualTo(valid);
    }

}