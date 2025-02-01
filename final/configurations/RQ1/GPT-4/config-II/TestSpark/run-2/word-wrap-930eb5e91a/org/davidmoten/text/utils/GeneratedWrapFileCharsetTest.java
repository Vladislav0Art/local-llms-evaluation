package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedWrapFileCharsetTest {

    @Test
    public void wrapFileCharsetTest() throws IOException {
        File file = File.createTempFile("prefix", "suffix");
        WordWrap.from("write to a file").wrap(file, StandardCharsets.UTF_8);
    }

}