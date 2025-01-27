package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.function.Function;

@RunWith(org.junit4.JUnit4.class)
public class GeneratedIsWhitespace {

    @Mock
    private BufferedReader reader;

    @Mock
    private File file;

    @Mock
    private Charset charset;

    @Mock
    private Function<? super CharSequence, Number> stringWidth;

    public static class LineConsumer {
        public void accept(CharSequence s) throws IOException {
        }
    }

    public static class Builder {
        // implementation...
    }

    @Test
    public void isWhitespace() {
        assertFalse(isWhitespace("hello"));
        assertFalse(isWhitespace("\t"));
        assertTrue(isWhitespace("\n"));
    }

}