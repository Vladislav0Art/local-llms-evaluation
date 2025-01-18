package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        Assert.assertNotNull(WordWrap.from(new StringReader("example")));
    }

}