package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.function.Function;

public class GeneratedWrapTest {

    @Test
    public void wrapTest() {
        StringWriter output = new StringWriter();
        WordWrap.from(new StringReader("Test String"))
                .wrap(output);

        Assert.assertEquals("Test String", output.toString());
    }

}