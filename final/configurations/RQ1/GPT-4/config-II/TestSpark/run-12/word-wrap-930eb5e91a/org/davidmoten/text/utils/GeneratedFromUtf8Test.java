package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.function.Function;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        Builder result = WordWrap.fromUtf8(System.in);
        Assert.assertNotNull(result);
    }

}