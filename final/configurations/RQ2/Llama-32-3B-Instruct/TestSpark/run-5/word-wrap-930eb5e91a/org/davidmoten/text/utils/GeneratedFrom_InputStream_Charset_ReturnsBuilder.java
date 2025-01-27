package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFrom_InputStream_Charset_ReturnsBuilder {

    @Mock
    private Reader reader;

    @Test
    public void from_InputStream_Charset_ReturnsBuilder() {
        InputStream in = new FileInputStream("file");
        Charset charset = StandardCharsets.UTF_8;
        Preconditions.checkNotNull(WordWrap.from(in, charset), "Expected a non-null value");
    }

}