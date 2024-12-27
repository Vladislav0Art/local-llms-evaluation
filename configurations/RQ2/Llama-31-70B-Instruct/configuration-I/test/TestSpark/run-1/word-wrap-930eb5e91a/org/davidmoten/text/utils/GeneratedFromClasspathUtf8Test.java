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

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "resource";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        assertEquals(builder.getResource(), resource);
    }

}