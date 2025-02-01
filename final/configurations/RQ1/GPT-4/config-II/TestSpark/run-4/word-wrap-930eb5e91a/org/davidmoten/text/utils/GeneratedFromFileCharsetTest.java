package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        Builder builder = WordWrap.from(new File("src/test/resources/test.txt"), StandardCharsets.UTF_8);
        String wrapResult = builder.wrap();

        Assert.assertNotNull(wrapResult);
    }

}