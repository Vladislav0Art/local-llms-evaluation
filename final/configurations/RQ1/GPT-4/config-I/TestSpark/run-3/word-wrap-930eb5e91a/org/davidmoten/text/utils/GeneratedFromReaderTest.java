package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() throws IOException {
        Reader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Test".getBytes())));
        Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

}