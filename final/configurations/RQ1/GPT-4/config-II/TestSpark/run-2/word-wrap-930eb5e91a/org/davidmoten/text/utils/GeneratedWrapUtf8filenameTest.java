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

public class GeneratedWrapUtf8filenameTest {

    @Test
    public void wrapUtf8filenameTest() throws IOException {
        File tempFile = File.createTempFile("prefixFilename", "suffixFilename");
        WordWrap.from("words").wrapUtf8(tempFile.getAbsolutePath());
    }

}