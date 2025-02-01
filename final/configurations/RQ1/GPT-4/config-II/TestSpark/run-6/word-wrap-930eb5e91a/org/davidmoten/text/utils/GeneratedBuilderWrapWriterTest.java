package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;

import static org.junit.Assert.*;

public class GeneratedBuilderWrapWriterTest {

    @Test
    public void builderWrapWriterTest() {
        CharSequence text = "This is a test text.";
        Writer writer = new StringWriter();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(text.toString());
            bufferedWriter.close();

            WordWrap.Builder builder = WordWrap.from(text);
            builder.wrap(writer);

            assertTrue(writer.toString().contains(text));
        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }

}