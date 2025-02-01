package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.function.Function;

public class GeneratedFromTest {

    @Test
    public void fromTest() {
        Builder result = WordWrap.from("Test Input");
        Assert.assertNotNull(result);
    }

}