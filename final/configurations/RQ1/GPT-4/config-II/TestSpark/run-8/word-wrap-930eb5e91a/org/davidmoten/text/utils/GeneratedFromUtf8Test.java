package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("Foo bar".getBytes());
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        WordWrap.fromUtf8(bais);
    }

}