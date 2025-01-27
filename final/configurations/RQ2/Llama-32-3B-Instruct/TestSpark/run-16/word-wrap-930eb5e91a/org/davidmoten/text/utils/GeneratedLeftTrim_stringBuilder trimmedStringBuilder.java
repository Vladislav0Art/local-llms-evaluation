package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

public class GeneratedLeftTrim_stringBuilder trimmedStringBuilder {

    @Test
    public void leftTrim_stringBuilder

    trimmedStringBuilder() {
        StringBuilder builder = new StringBuilder("   Hello World   ");
        StringBuilder expectedOutput = new StringBuilder("  Hello World");
        WordWrap.leftTrim(builder);
        assertEquals(expectedOutput, builder);
    }
}

public class WordWrap {

    private String input;

    public WordWrap(String input) {
        this.input = input;
    }

    public static WordWrap from(String input) {
        return new WordWrap(input);
    }

    public static WordWrap fromClasspathUtf8(String input) throws IOException {
        // implement logic to load string from classpath
        return new WordWrap(input);
    }

    public static WordWrap fromFile(String input) throws IOException {
        // implement logic to load string from file
        return new WordWrap(input);
    }

    public String rightTrim() {
        int index = input.lastIndexOf(' ');
        if (index == -1) {
            return input;
        }
        return input.substring(index + 1);
    }

    public static StringBuilder leftTrim(StringBuilder builder) {
        int index = builder.indexOf(' ');
        if (index != -1) {
            builder.deleteCharAt(index);
        }
        return builder;
    }

}