package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        Reader reader = Mockito.mock(Reader.class);
        assertEquals(WordWrap.Builder.class, WordWrap.from(reader).getClass());
    }

}