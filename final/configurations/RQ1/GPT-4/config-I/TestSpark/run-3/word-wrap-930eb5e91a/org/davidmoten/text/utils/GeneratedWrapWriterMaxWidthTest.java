package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedWrapWriterMaxWidthTest {

    @Test
    public void wrapWriterMaxWidthTest() throws IOException {
        Reader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Test".getBytes())));
        Writer writer = new BufferedWriter(new OutputStreamWriter(new ByteArrayOutputStream()));
        WordWrap.from(reader).maxWidth(2).wrap(writer);
    }

}