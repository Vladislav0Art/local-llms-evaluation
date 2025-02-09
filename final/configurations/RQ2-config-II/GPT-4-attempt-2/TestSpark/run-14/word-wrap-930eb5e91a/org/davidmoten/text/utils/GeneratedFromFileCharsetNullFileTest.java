package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedFromFileCharsetNullFileTest {

    @Test
    public void fromFileCharsetNullFileTest() throws FileNotFoundException {
        File file = null;
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(file, charset);
    }

}