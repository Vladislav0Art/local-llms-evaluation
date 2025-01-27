package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

public class GeneratedTestFromClasspath_StringResource_Charset_ReturnsBuilder {

    public static void main(String[] args) {
        // implementation
    }

    @Test
    public void testFromClasspath_StringResource_Charset_ReturnsBuilder() {
        String resource = "resource";
        Charset charset = StandardCharsets.UTF_8;
        Preconditions.checkNotNull(WordWrap.Builder.fromClasspath(resource, charset), "Expected a non-null value");
    }

    public static class WordWrap {
        public static void wordWrap(Reader in, Writer out, String newLine, Number maxWidth, java.util.function.Function<CharSequence, Number> stringWidth,
                                    Set<Character> extraWordChars, boolean insertHyphens, boolean breakWords) throws IOException {
            // implementation
        }

        public static boolean isWhitespace(CharSequence input) {
            // implementation
            return true;
        }

        public static String rightTrim(String input) {
            // implementation
            return "";
        }
    }

}