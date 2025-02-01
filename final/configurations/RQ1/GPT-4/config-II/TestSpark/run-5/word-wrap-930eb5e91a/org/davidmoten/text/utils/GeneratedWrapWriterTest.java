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

public class GeneratedWrapWriterTest {

    @Test
    public void wrapWriterTest() {
        String input = "Hello world this is a test of WordWrap wrap with writer.";
        StringReader reader = new StringReader(input);
        StringWriter writer = new StringWriter();
        WordWrap.from(reader).wrap(writer);
        String output = writer.toString();
        Assert.assertTrue(output.contains("\n"));
    }

}