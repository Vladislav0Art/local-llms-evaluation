package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() throws Exception {
        java.io.File file = new java.io.File("test.txt");
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.from(file, charset);
        assertNotNull(builder);
    }

}