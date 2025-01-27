package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromClasspath_buildsBuilder {

    @Mock
    private BufferedReader reader;

    @Mock
    private LineConsumer lineConsumer;

    private WordWrap wordWrap = new WordWrap();

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.davidmoten.text.utils.WordWrapTest");
    }

    @Test
    public void fromClasspath_buildsBuilder() {
        // Given
        String resource = "test-resource";
        Charset charset = StandardCharsets.UTF_8;

        // When
        Builder builder = wordWrap.fromClasspath(resource, charset);

        // Then
        assertNotNull(builder);
    }

}