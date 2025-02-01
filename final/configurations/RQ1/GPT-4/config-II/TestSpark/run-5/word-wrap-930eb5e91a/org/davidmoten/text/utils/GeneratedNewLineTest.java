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

public class GeneratedNewLineTest {

    @Test
    public void newLineTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        builder.newLine("\r\n");
        Assert.assertEquals("\r\n", builder.newLine);
    }

}