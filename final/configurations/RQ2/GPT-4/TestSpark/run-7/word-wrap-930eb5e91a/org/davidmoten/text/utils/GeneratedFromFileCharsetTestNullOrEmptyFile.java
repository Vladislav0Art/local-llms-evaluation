package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class GeneratedFromFileCharsetTestNullOrEmptyFile {

    @Test
    public void fromFileCharsetTestNullOrEmptyFile() {
        WordWrap.from(new File(""), StandardCharsets.UTF_8);
    }

}