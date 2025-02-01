package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("Foo bar".getBytes());
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        WordWrap.from(bais, StandardCharsets.UTF_8);
    }

}