package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedFromUtf8_ReturnsBuilder {

    @Test
    public void fromUtf8_ReturnsBuilder() {
        byte[] bytes = "Hello World!".getBytes();
        InputStream in = new ByteArrayInputStream(bytes);
        assertTrue(WordWrap.fromUtf8(in) instanceof Builder);
    }

}