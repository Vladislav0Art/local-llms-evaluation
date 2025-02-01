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

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("a string reader");
        Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

}