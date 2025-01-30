package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedFromFileCharsetFileNotFoundTest {

    @Test
    public void fromFileCharsetFileNotFoundTest() {
        File file = new File("non_existent_file");
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

}