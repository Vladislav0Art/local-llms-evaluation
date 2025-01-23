package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() {
        java.io.File file = new java.io.File("test.txt");
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(file, charset);
        assertNotNull(builder);
    }

}