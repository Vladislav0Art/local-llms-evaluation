package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.function.Function;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        try {
            Builder result = WordWrap.fromClasspathUtf8("test");
            Assert.assertNotNull(result);
        } catch (NullPointerException e) {
            Assert.assertTrue(e.getMessage().contains("InputStream"));
        }
    }

}