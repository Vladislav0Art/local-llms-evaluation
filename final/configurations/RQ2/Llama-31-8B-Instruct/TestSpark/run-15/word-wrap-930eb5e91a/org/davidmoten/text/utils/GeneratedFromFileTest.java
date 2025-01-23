package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() {
        File file = new File("test.txt");
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(file, charset);
        assertNotNull(builder);
    }

}