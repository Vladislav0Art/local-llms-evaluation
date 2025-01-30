package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedWrapWriterTest {

    @Test
    public void wrapWriterTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        StringWriter writer = new StringWriter();
        builder.wrap(writer);
        writer.flush();
        Assert.assertEquals("test", writer.toString());
    }

}