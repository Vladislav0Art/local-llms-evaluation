package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedBuilderWrapWriterTest {

    @Test
    public void builderWrapWriterTest() throws IOException {
        StringReader reader = new StringReader("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        StringWriter writer = new StringWriter();
        WordWrap.Builder builder = WordWrap.from(reader);
        builder.wrap(writer);
    }

}