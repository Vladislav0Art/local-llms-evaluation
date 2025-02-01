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

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        File file = new File("test.txt");
        Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

}