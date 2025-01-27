package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedFromClasspath_StringResource_Charset_ReturnsBuilder {

    @Mock
    private Reader reader;

    public static class Builder {
        // implementation
    }

    @Test
    public void fromClasspath_StringResource_Charset_ReturnsBuilder() {
        String resource = "resource";
        Charset charset = StandardCharsets.UTF_8;
        Preconditions.checkNotNull(WordWrap.Builder.fromClasspath(resource, charset), "Expected a non-null value");
    }

    public static class WordWrap {
        public static void wordWrap(Reader in, Writer out, String newLine, Number maxWidth, Function<CharSequence, Number> stringWidth,
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