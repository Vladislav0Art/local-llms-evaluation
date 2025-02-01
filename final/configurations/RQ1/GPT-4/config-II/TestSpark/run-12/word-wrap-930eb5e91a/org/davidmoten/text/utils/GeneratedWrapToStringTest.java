package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.function.Function;

public class GeneratedWrapToStringTest {

    @Test
    public void wrapToStringTest() {
        String result = WordWrap.from(new StringReader("Test String"))
                .wrap();

        Assert.assertEquals("Test String", result);
    }

}