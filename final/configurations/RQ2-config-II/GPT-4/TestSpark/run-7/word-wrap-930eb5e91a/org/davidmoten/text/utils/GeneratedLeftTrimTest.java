package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder2 word = new StringBuilder2("  Test string");
        WordWrap.leftTrim(word);

        assertEquals("Test string", word.toString());
    }

    public class TestLineConsumer implements LineConsumer {
        private String output;

        @Override
        public void accept(CharSequence t) {
            output = t.toString();
        }

        public String getOutput() {
            return output;
        }
    }

}