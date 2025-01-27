package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromInputStream_buildsBuilder {

    @Mock
    private BufferedReader reader;

    @Mock
    private LineConsumer lineConsumer;

    private WordWrap wordWrap = new WordWrap();

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.davidmoten.text.utils.WordWrapTest");
    }

    @Test
    public void fromInputStream_buildsBuilder() {
        // Given
        InputStream in = new FileInputStream(new File("test-file"));
        Charset charset = StandardCharsets.UTF_8;

        // When
        Builder builder = wordWrap.from(in, charset);

        // Then
        assertNotNull(builder);
    }

}