package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromFile_buildsBuilder {

    @Mock
    private BufferedReader reader;

    @Mock
    private LineConsumer lineConsumer;

    private WordWrap wordWrap = new WordWrap();

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.davidmoten.text.utils.WordWrapTest");
    }

    @Test
    public void fromFile_buildsBuilder() {
        // Given
        File file = new File("test-file");

        // When
        Builder builder = wordWrap.from(file);

        // Then
        assertNotNull(builder);
    }

}