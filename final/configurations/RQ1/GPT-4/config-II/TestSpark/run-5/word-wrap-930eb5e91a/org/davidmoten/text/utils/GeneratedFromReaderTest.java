package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        String input = "Hello world this is a test of WordWrap from reader.";
        StringReader reader = new StringReader(input);
        Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

}