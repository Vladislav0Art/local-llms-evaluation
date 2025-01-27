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
public class GeneratedFromClasspath_StringResource_Charset_ReturnsBuilder_DifferentCharset {

    @Mock
    private Reader reader;

    @Test
    public void fromClasspath_StringResource_Charset_ReturnsBuilder_DifferentCharset() {
        String resource = "resource";
        Charset charset = StandardCharsets.ISO_8859_1;
        Preconditions.checkNotNull(WordWrap.fromClasspath(resource, charset), "Expected a non-null value");
    }

}