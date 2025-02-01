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

public class GeneratedWrapUtf8FileTest {

    @Test
    public void wrapUtf8FileTest() throws IOException {
        File file = File.createTempFile("prefixFile", "suffixFile");
        WordWrap.from("words to write to file").wrapUtf8(file);
    }

}