package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.davidmoten.text.utils.WordWrap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromInputStreamBuildsBuilder {

    @Mock
    private Reader reader;

    @Mock
    private LineConsumer lineConsumer;

    private WordWrap wordWrap = new WordWrap();

    @Test
    public void fromInputStreamBuildsBuilder() {
        // Given
        InputStream in = new FileInputStream(new File("test-file"));
        Charset charset = StandardCharsets.UTF_8;

        // When
        Builder builder = wordWrap.from(in, charset);

        // Then
        assertNotNull(builder);
    }

}