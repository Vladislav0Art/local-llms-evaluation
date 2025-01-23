package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() throws Exception {
        File file = new File("test.txt");
        Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(file, charset);
        assertNotNull(builder);
    }

}