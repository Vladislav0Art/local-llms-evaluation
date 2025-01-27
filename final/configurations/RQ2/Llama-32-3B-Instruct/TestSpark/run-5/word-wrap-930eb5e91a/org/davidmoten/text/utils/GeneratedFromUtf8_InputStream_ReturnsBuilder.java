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
public class GeneratedFromUtf8_InputStream_ReturnsBuilder {

    @Mock
    private Reader reader;

    @Test
    public void fromUtf8_InputStream_ReturnsBuilder() {
        InputStream in = new FileInputStream("file");
        Preconditions.checkNotNull(WordWrap.fromUtf8(in), "Expected a non-null value");
    }

}