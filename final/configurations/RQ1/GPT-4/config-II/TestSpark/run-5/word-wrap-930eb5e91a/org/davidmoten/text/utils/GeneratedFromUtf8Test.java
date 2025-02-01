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

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        InputStream inputStream = new ByteArrayInputStream("Test".getBytes(StandardCharsets.UTF_8));
        Builder builder = WordWrap.fromUtf8(inputStream);
        Assert.assertNotNull(builder);
    }

}