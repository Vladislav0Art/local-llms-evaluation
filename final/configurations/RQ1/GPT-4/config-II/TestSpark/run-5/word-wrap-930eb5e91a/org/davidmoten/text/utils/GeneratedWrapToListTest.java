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

public class GeneratedWrapToListTest {

    @Test
    public void wrapToListTest() {
        String input = "Hello world this is a test of WordWrap overall functionality.";
        Builder builder = WordWrap.from(input);
        builder.maxWidth(20);
        List<String> wrappedLines = builder.wrapToList();
        Assert.assertTrue(wrappedLines.get(0).length() <= 20);
    }

}