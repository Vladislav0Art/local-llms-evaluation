package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.function.Function;

public class GeneratedStringWidthTest {

    @Test
    public void stringWidthTest() {
        Function<CharSequence, Number> func = (s) -> s.length() + 5;
        Builder builder = WordWrap.from(new StringReader("0123456789"))
                .stringWidth(func);

        Assert.assertNotNull(builder);
    }

}