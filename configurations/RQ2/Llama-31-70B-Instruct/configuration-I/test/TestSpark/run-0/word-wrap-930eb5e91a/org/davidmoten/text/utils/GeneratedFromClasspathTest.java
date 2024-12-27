package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.Writer;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        String resource = "resource";
        Charset charset = Charset.defaultCharset();
        WordWrap.Builder builder = WordWrap.fromClasspath(resource, charset);
        assertEquals(builder.getResource(), resource);
        assertEquals(builder.getCharset(), charset);
    }

}