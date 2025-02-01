package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        WordWrap.from(new File("src/test/resources/test.txt"), StandardCharsets.UTF_8);
    }

}