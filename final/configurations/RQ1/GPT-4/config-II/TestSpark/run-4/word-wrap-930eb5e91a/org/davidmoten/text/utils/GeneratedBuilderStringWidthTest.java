package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class GeneratedBuilderStringWidthTest {

    @Test
    public void builderStringWidthTest() {
        Builder builder = getDefaultBuilder();
        builder.stringWidth(s -> s.length() * 2);

        Assert.assertEquals("test width", builder.wrap());
    }

}