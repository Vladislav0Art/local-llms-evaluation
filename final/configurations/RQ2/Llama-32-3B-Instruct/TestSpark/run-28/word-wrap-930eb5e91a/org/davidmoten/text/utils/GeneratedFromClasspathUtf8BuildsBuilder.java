package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromClasspathUtf8BuildsBuilder {

    @Mock
    private BufferedReader reader;

    @Mock
    private LineConsumer lineConsumer;

    private WordWrap wordWrap = new WordWrap();

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.davidmoten.text.utils.WordWrapTest");
    }

    @Test
    public void fromClasspathUtf8BuildsBuilder() {
        // Given
        String resource = "test-resource";

        // When
        Builder builder = wordWrap.fromClasspathUtf8(resource);

        // Then
        assertNotNull(builder);
    }

}