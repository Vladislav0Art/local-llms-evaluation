package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedFromInvalidFileCharsetTest {

    @Test
    public void fromInvalidFileCharsetTest() throws IOException {
        WordWrap.from(new File("Invalid.txt"), Charset.defaultCharset());
    }

}