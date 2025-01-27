package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromReader_buildsBuilder {

    @Mock
    private BufferedReader reader;

    @Mock
    private LineConsumer lineConsumer;

    private WordWrap wordWrap = new WordWrap();

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.davidmoten.text.utils.WordWrapTest");
    }

    @Test
    public void fromReader_buildsBuilder() {
        // Given
        when(reader.readLine()).thenReturn(null);

        // When
        Builder builder = wordWrap.from(reader);

        // Then
        assertNotNull(builder);
    }

}