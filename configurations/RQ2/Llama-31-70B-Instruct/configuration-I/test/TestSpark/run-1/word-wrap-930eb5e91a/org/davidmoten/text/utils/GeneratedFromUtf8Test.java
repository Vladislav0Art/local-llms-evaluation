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

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() throws IOException {
        InputStream in = Mockito.mock(InputStream.class);
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        assertEquals(builder.getInputStream(), in);
    }

}