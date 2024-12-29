package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.io.StringReader;
import java.io.StringWriter;

public class GeneratedFromReaderCloseTest {

    @Test
    public void fromReaderCloseTest() {
        StringReader reader = Mockito.spy(new StringReader("test"));
        assertNotNull(WordWrap.from(reader, true));
        Mockito.verify(reader, Mockito.times(1)).close();
    }

}