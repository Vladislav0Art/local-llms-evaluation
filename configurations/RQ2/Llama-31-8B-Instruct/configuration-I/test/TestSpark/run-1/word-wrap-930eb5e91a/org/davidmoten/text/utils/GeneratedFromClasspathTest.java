package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.io.CharSequenceReader;
import java.io.StringReader;
import java.io.Writer;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() throws IOException {
        String resource = "Hello World";
        Charset charset = Charset.forName("UTF-8");
        Builder builder = WordWrap.fromClasspath(resource, charset);
        assertEquals(resource, builder.getResource());
        assertEquals(charset, builder.getCharset());
    }

}